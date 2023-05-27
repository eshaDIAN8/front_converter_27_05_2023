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
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
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

@SpringBootTest
@RunWith(SpringRunner.class)
@ExtendWith(SpringExtension.class)
@ActiveProfiles({"test"})
@EnabledIf(value = "#{environment.getActiveProfiles()[0] == 'test'}", loadContext = true)
class FrontConverterTestDrivenDevlopmentApplicationTests {

	@Autowired
	TtdFrontDao dao;
  
    
   // @Autowired
    private TestRestTemplate testRestTemp = new TestRestTemplate();
	
	@Test
	void contextLoads() {
								
	}
	
	

   
	
	        @Test
			public void test1_Component_Testing() throws Exception {
	        	
		    	String convertedUnit ="meter-cm";
		    	
		    	String uri = "http://localhost:8089/converter/meter/cm/5";
		    	
		   	 
		    	String formula = dao.getFormula(convertedUnit) ;  
			    	System.out.println("formula::"+formula);
		    	
		    	 ResponseEntity<String> result=	testRestTemp.getForEntity(uri, String.class);
		    	
		    
			    	
		    	 System.out.println("result ::"+result.getBody()); 
		    	 
		     				
		    	 Assert.assertEquals(200,result.getStatusCodeValue());
		    	
		    
		    	
		    	
		    	
		    	
		    	
		    	
		    	
				//ResponseEntity<String> responseCrud = new ResponseEntity("*100", HttpStatus.OK);
				    	
			//	String uri = "http://localhost:8089/converter/meter/cm/7";	
				
		   // ResponseEntity<String> result=	restTemplate.getForEntity(uri, String.class);
		    	
		        
		    
		    //Assert.assertEquals(200,responseEntity.getStatusCodeValue());
			   
			
		    		/* MvcResult mvcResult =  (MvcResult) mockMvc
 				.perform(MockMvcRequestBuilders.get(uri,"meter","cm","5"))
 				.andExpect(MockMvcResultMatchers.status().isOk())
 				.andExpect(MockMvcResultMatchers.content().string("500.0")).andReturn();	
 	*/		 
 			// Assert.assertEquals("5000.0", mvcResult.getResponse().getContentAsString());

		    
		    }	    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
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