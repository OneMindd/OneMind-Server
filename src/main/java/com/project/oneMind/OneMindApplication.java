package com.project.oneMind;

import com.project.oneMind.domain.user.domain.repository.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class }, scanBasePackageClasses = UserRepository.class)
//@EnableConfigurationProperties({JwtProperties.class})
public class OneMindApplication {

	public static void main(String[] args) {
		SpringApplication.run(OneMindApplication.class, args);
	}

}
