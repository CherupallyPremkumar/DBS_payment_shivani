package com.example.DBS_payment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DbsPaymentApplication {

	public static void main(String[] args) {

		SpringApplication.run(DbsPaymentApplication.class, args);
	}

}
