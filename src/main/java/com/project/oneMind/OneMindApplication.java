package com.project.oneMind;

import com.project.oneMind.domain.user.domain.repository.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackageClasses = UserRepository.class)
public class OneMindApplication {

	public static void main(String[] args) {
		SpringApplication.run(OneMindApplication.class, args);
	}

}
