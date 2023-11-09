package com.project.oneMind;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"org.springframework.web.client.RestTemplate"})
public class OneMindApplication {

	public static void main(String[] args) {
		SpringApplication.run(OneMindApplication.class, args);
	}

}
