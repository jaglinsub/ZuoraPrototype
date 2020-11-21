package com.zuora.prototype;

import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;
import org.jasypt.iv.RandomIvGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ZuoraPrototypeApplication {

	public static void main(String[] args) {
        //System.setProperty("jasypt.encryptor.algorithm", "PBEWithMD5AndDES");
        //System.setProperty("jasypt.encryptor.iv-generator-classname", "org.jasypt.iv.NoIvGenerator");

//        StandardPBEStringEncryptor encryptor = new StandardPBEStringEncryptor();
//        encryptor.setAlgorithm("PBEWithHMACSHA512AndAES_256");   // optionally set the algorithm
//        encryptor.setIvGenerator(new RandomIvGenerator());
//        encryptor.setPassword("password");                         // we HAVE TO set a password
//        String encryptedText = encryptor.encrypt("210fe90a-8ef3-4339-a333-78d9239c2386");
//        System.out.println("encryptedText: " + encryptedText);
//        String plainText = encryptor.decrypt(encryptedText);  // myText.equals(plainText)
//        System.out.println("plainText: " + plainText);


		SpringApplication.run(ZuoraPrototypeApplication.class, args);
	}

}
