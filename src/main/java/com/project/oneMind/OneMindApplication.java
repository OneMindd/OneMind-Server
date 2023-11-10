package com.project.oneMind;

import com.project.oneMind.global.common.jwt.config.JwtProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
//@EnableConfigurationProperties({JwtProperties.class})
public class OneMindApplication {

	public static void main(String[] args) {
		SpringApplication.run(OneMindApplication.class, args);
	}

}
