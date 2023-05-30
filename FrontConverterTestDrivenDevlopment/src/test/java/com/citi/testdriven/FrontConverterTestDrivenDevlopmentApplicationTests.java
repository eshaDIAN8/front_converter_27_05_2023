package com.citi.testdriven;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

import javax.annotation.Resource;

import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.EnabledIf;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.client.RestTemplate;

import com.citi.testdriven.frontservice.controller.TtdFrontController;
import com.citi.testdriven.frontservice.dao.TtdFrontDao;
import com.citi.testdriven.frontservice.dao.TtdFrontDaoImplStatic;
import com.citi.testdriven.frontservice.service.TtdFrontService;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@RunWith(SpringRunner.class)
@ExtendWith(SpringExtension.class)
@ActiveProfiles({"test"})
//@WebMvcTest
//@EnabledIf(value = "#{environment.getActiveProfiles()[0] == 'test'}", loadContext = true)
class FrontConverterTestDrivenDevlopmentApplicationTests {

	
	@Value(value="${local.server.port}")
	private int port; 
	
	@Autowired
	TtdFrontDao dao;
  
    
    @Autowired
    private TestRestTemplate testRestTemp ;
	
	@Test
	void contextLoads() {
								
	}
	
	

   
	
	        @Test
			public void test1_Component_Testing() throws Exception {
	        	
		    	String convertedUnit ="meter-cm";
		    	
		    	//String uri = "http://localhost:8089/converter/meter/cm/5";
		    	
		 
		    //	 ResponseEntity<String> result=	testRestTemp.getForEntity(uri, String.class);
		    	 	
		    	 String result = testRestTemp.getForObject("http://localhost:"+ port +
		    			"/converter/meter/cm/5", String.class);
		    	 
		    	// System.out.println("result ::"+result.getBody()); 		     				
		    	Assert.assertEquals("500.0",result);
		    	
	        }
		    	
		    		      	
}	        
		    
		  
		    
		    	    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
			
		 
		    
		
	

	
	/*
	@Test public void greetingShouldReturnDefaultMessage() throws Exception
	{ 
		
		assertThat(this.restTemplate.
			getForObject("http://localhost:" + port + "/", 
					String.class)).contains("Hello, World"); }
}*/

