package com.citi.testdriven.frontservice.service;

import static org.mockito.Mockito.when;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit.jupiter.SpringExtension;

//@SpringBootTest
@ExtendWith(SpringExtension.class)
@SpringBootTest
//(webEnvironment = WebEnvironment.RANDOM_PORT)
@RunWith(MockitoJUnitRunner.class)
public class TtdFrontServiceTest {
	
	
	
	
	//@Autowired
	private TestRestTemplate testRestTemplate = new TestRestTemplate();
	
/*	
	@Value(value="${local.server.port}")
	private int port;*/

	//hv to move this testing in main class
	//hv to create dao interface
	//hv to implement two class one will directly call rest template
	//one will return static string data and 
	//write test case which will call getFormula method's behavour,,should not directly call crud service..
	//hv to call one service from another service without manually start the other service..
    // hv to use profiling just to activate test class 
	/*@Test
	public void testIntegrationTestingMethod() {
		
		String convertedUnit ="km-meter";
		String uri = "http://localhost:8080/getConvertedUnit/";
		ResponseEntity<String> result=	testRestTemplate.getForEntity(uri+convertedUnit, String.class);
		
		System.out.println("result of integration testing;;"+result.getBody());
		Assert.assertEquals(HttpStatus.OK.value(),result.getStatusCode().value());	
		//System.out.println("result::"+result);
			
		
	}*/

	
	
	
	
	              @Test
				public void test1_Component_Testing() throws Exception {	
			    	
			    	String fromUnit ="meter";
			    	String toUnit = "cm";
			    	String value = "7";	    	
			    	
			   
					//ResponseEntity<String> responseCrud = new ResponseEntity("*100", HttpStatus.OK);
					    	
					String uri = "http://localhost:8089/converter/meter/cm/7";
			    //	String frontUri = "/{fromUnit}/{toUnit}/{value}";
			    	
			    	
			    	ResponseEntity<String> result=	testRestTemplate.getForEntity(uri, String.class);
			    	
			    System.out.println("in main class result::"+result.getBody());
				   
				 
			    
			    }	    
			    
}
