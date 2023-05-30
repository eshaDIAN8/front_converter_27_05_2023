package com.citi.testdriven;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@ComponentScan({"com.citi.testdriven.frontservice.controller",
	"com.citi.testdriven.frontservice.dao",
	"com.citi.testdriven.frontservice.service"})

public class FrontConverterTestDrivenDevlopmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(FrontConverterTestDrivenDevlopmentApplication.class, args);
		/*ApplicationContext context = SpringApplication.
				run(FrontConverterTestDrivenDevlopmentApplication.class, args);
		
		Object bean = context.getBean("ttdFrontDaoImplStatic");
		String myProp = (String)bean;
		System.out.println("myProp"+myProp);*/
	}
	
	  @Bean
	    public RestTemplate restTemplate(){
	        return new RestTemplate();
	    }

}
