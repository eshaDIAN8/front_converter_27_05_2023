package com.citi.testdriven.frontservice.service;

import static org.mockito.Mockito.when;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.TestTemplate;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;


import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.citi.testdriven.frontservice.dao.TtdFrontDao;

@RunWith(MockitoJUnitRunner.class)
@ExtendWith(SpringExtension.class)
@SpringBootTest
public class TtdFrontServiceTest {
	
	
	@InjectMocks
	TtdFrontService service;


	@Mock
	private TestTemplate testRestTemplate;
	

	@Mock
	TtdFrontDao dao ;
	
	@Test
	public void testService() {
		
		String convertedUnit ="meter-cm";
		String formula ="*100";

    	when(dao.getFormula(convertedUnit)).thenReturn("*100");
    	double convertedResult = service.getConvertedResult(convertedUnit, 5);
    	String convertedResult1 = String.valueOf(convertedResult);
    	// Assert.assertEquals(500,convertedResult );
    	
    
	}
	
	

}
