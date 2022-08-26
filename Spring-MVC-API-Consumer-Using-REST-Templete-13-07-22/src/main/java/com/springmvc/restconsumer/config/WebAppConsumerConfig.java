package com.springmvc.restconsumer.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages  = "com.springmvc.restconsumer")
public class WebAppConsumerConfig {

	@Bean
	public RestTemplate getRestTemplate() {
	
		
		return new RestTemplate();
	}
	
}
