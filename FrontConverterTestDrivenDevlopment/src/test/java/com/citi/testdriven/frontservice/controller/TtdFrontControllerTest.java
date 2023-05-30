package com.citi.testdriven.frontservice.controller;




import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.TestTemplate;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;



import org.springframework.http.ResponseEntity;
import org.springframework.mock.web.MockHttpServletResponse;
//import org.springframework.test.context.junit.jupiter.SpringExtension;
/*import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;*/
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.citi.testdriven.frontservice.dao.TtdFrontDao;
import com.citi.testdriven.frontservice.service.TtdFrontService;
import com.fasterxml.jackson.core.JsonProcessingException;



import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;

@ExtendWith(SpringExtension.class)
//@WebMvcTest(TtdFrontController.class)
@SpringBootTest
@AutoConfigureMockMvc
@RunWith(MockitoJUnitRunner.class)
public class TtdFrontControllerTest {
	
	
	
	@InjectMocks
	private TtdFrontController controller;

	@Mock
	private TestTemplate testRestTemplate;
	
	
	@Mock
	private TtdFrontService service;
	
	private MockMvc mockMvc;
	
	@Mock
	private MockMvcRequestBuilders mockMvcBuilder;

	@Mock
	TtdFrontDao dao ;
	
	
	@Before
	public void setUp() {
		mockMvc = MockMvcBuilders.standaloneSetup(controller).build();
		
	}
	     

	    @Test
		public void test_Controller_Method_UnitTesting_failure_Scenario() throws JsonProcessingException, NumberFormatException {
	    	
	    	String fromUnit ="km";
	    	String toUnit = "meter";
	    	String convertedUnit = fromUnit+"-"+toUnit;
	    	String value = "5";
	    	
	    	//String uri = "/converter/{fromUnit}/{toUnit}/{value}";
	    	
	    	//when(service.getFormula(convertedUnit,Double.parseDouble(value))).thenReturn(5000.0);
	    	
	    	//ResponseEntity<String> response =controller.getFormulaFromCrud("km", "meter", Double.parseDouble(value));
	    	//Assert.assertEquals("5000", response.getBody());
	    }
	    
	    
	
	    @Test
		public void testByMockMvcUnitTesting_failure_Scenario() throws Exception {	
	    	
	    	String fromUnit ="km";
	    	String toUnit = "meter";
	    	String convertedUnit = fromUnit+"-"+toUnit;
	    	String value = "5";
	    	
	    	String uri = "/converter/{fromUnit}/{toUnit}/{value}";
	    	
	    	//when(dao.getFormula(convertedUnit)).thenReturn("*1000");
	    	//when(service.getAfterProcessingResult("*1000",5)).thenReturn(5000.0);
	    	when(service.getConvertedResult(convertedUnit, 5)).thenReturn(5000.0);
	  
	    	 
		 MvcResult mvcResult =  (MvcResult) mockMvc
			.perform(MockMvcRequestBuilders.get(uri,"km","meter","5"))
			.andExpect(MockMvcResultMatchers.status().isOk())
			.andExpect(MockMvcResultMatchers.content().string("5000.0")).andReturn();	
		 
		 Assert.assertEquals("5000.0", mvcResult.getResponse().getContentAsString());
	    }
	    
	    
	    @Test
		public void test2UnitTesting_Success_Scenario() throws Exception {	
	    	
	    	String fromUnit ="km";
	    	String toUnit = "meter";
	    	String convertedUnit = fromUnit+"-"+toUnit;
	    	String value = "5";
	    	
	    	String uri = "/converter/{fromUnit}/{toUnit}/{value}";
	    	//when(dao.getFormula(convertedUnit)).thenReturn("*1000");
	    	when(service.getConvertedResult(convertedUnit, 5)).thenReturn(5000.0);
	    	 
		 MvcResult mvcResult =  (MvcResult) mockMvc
			.perform(MockMvcRequestBuilders.get(uri,"km","meter","5"))
			.andExpect(MockMvcResultMatchers.status().isOk())
			.andExpect(MockMvcResultMatchers.content().string("5000.0")).andReturn();
		 Assert.assertEquals("5000.0", mvcResult.getResponse().getContentAsString());
	    }
	     
	    
  
					
		
	
		
					
		
		
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

