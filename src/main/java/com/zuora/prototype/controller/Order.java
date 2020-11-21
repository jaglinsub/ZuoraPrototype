package com.zuora.prototype.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.zuora.prototype.models.CreateOrderNewUserRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.core.env.Environment;
import org.springframework.http.*;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@RequestMapping("/api/order")
public class Order {

    String baseURL  = "https://rest.apisandbox.zuora.com";

    @Autowired
    private Environment env;

    @PostMapping("createOrder")
    @ResponseStatus(HttpStatus.CREATED)
    String createOrder(@RequestBody CreateOrderNewUserRequest body) {

        String url = baseURL + "/v1/orders";
        RestTemplate restTemplate = new RestTemplate();
        String responseEntity = "EMPTY";

        String accessToken = getBearerToken();

        responseEntity = restTemplate.exchange(url, HttpMethod.POST,
                createOrderRequestHeaders(accessToken, body), String.class).getBody();

        return responseEntity;
    }

    private HttpEntity createOrderRequestHeaders(String accessToken, CreateOrderNewUserRequest body) {
        // create headers
        HttpHeaders headers = new HttpHeaders();
        headers.add("Authorization", "Bearer " + accessToken);

        // create request
        HttpEntity<CreateOrderNewUserRequest> requestHeaders = new HttpEntity<CreateOrderNewUserRequest>(body, headers);
        return  requestHeaders;
    }

    private String getBearerToken() {
        System.out.println("jasypt.encryptor.password=" + System.getProperty("jasypt.encryptor.password"));
        System.out.println("client_id=" + env.getProperty("client_id"));
        System.out.println("grant_type=" + env.getProperty("grant_type"));
        System.out.println("client_secret=" + env.getProperty("client_secret"));

        String url = baseURL + "/oauth/token";
        HttpHeaders requestHeaders = new HttpHeaders();
        requestHeaders.add("Content-Type", "application/x-www-form-urlencoded");

        MultiValueMap<String, String> parametersMap = new LinkedMultiValueMap<String, String>();
        parametersMap.add("client_id", env.getProperty("client_id"));
        parametersMap.add("grant_type", env.getProperty("grant_type"));
        parametersMap.add("client_secret", env.getProperty("client_secret"));

        //request entity is created with request headers
        HttpEntity requestEntity = new HttpEntity(parametersMap, requestHeaders);
        RestTemplate restTemplate = new RestTemplate();
        String strResponseEntity = "EMPTY";

        ResponseEntity<String> responseEntity = restTemplate.exchange(url,
                HttpMethod.POST,
                requestEntity, String.class);

        ObjectMapper mapper = new ObjectMapper();
        JsonNode root = null;
        try {
            root = mapper.readTree(responseEntity.getBody());
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        JsonNode access_token = root.path("access_token");
        System.out.println("responseEntity Bearer Token: " + access_token.asText());
        strResponseEntity = access_token.asText() != null ? access_token.asText() : "EMPTY";
        return strResponseEntity;
    }
}
