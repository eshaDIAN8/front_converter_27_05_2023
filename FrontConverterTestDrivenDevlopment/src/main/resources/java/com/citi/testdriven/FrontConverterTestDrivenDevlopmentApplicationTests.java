package com.citi.testdriven;

import static org.mockito.Mockito.when;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import org.mockito.InjectMocks;
import org.mockito.Mock;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;

import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit.jupiter.SpringExtension;


import com.citi.testdriven.frontservice.controller.TtdFrontController;
import com.citi.testdriven.frontservice.service.TtdFrontService;

@SpringBootTest
//@RunWith(MockitoJUnitRunner.class)
//@ExtendWith(SpringExtension.class)
class FrontConverterTestDrivenDevlopmentApplicationTests {


/*
	//@Autowired
	 TestRestTemplate testRestTemplate = new TestRestTemplate();

	
	
	
	@Test
	void contextLoads() {
		
		
		
	}
	
	
	
	
	
	 //for component testing its like black box testing..only i hv to call front service 
		//without knowings its all the methods nm..just to hit url by using rest template
		//hv to move this method in main application class..
		 
		    @Test
			public void test1_Component_Testing() throws Exception {	
		    	
		    	String fromUnit ="meter";
		    	String toUnit = "cm";
		    	String value = "7";	    	
		    	
		   
				//ResponseEntity<String> responseCrud = new ResponseEntity("*100", HttpStatus.OK);
				    	
				String uri = "http://localhost:8089/converter/meter/cm/7";
		    //	String frontUri = "/{fromUnit}/{toUnit}/{value}";
		    	
		    	
		    	ResponseEntity<String> result=	testRestTemplate.getForEntity(uri, String.class);
		    	
		    System.out.println("in main class result"+result.getBody());
			   
			 
		    
		    }	    
		    
		    
		*/    
		    
		    
		    
		    
		    
		    
		    
		    
		    //  ResponseEntity<String> responseFront = new ResponseEntity("700",HttpStatus.OK);
				
			        /* MvcResult mvcResult =  (MvcResult) mockMvc
						.perform(MockMvcRequestBuilders.get(frontUri,"meter","cm","7"))
						.andExpect(MockMvcResultMatchers.status().isOk())
						.andExpect(MockMvcResultMatchers.content().string("700.0")).andReturn();	
					*/
				
			   /* System.out.println("mvcResult::"+mvcResult.getResponse().getContentAsString());		 
			    Assert.assertEquals(HttpStatus.OK.value(),mvcResult.getResponse().getStatus());
				*/
		
		 
		    
		
	

	
	/*
	@Test public void greetingShouldReturnDefaultMessage() throws Exception
	{ 
		
		assertThat(this.restTemplate.
			getForObject("http://localhost:" + port + "/", 
					String.class)).contains("Hello, World"); }
}*/

}