package com.example.DBS_payment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableConfigurationProperties
@EntityScan(basePackages = {"com.example.DBS_payment.Entity"})
public class DbsPaymentApplication {

	public static void main(String[] args) {

		SpringApplication.run(DbsPaymentApplication.class, args);
	}

}
