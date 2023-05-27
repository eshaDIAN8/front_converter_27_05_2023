package com.citi.testdriven.frontservice.daoImpl;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;




//@WebMvcTest(TtdFrontController.class)

//(webEnvironment = WebEnvironment.RANDOM_PORT)
//@AutoConfigureMockMvc
@RunWith(MockitoJUnitRunner.class)
@ExtendWith(SpringExtension.class)
//@SpringBootTest
@ActiveProfiles(value = "test")
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class TtdFrontDaoImplTest {
	
	
	@Value(value="${local.server.port}")
	private int port;
  
	
	//@Autowired
	TtdFrontDaoImpl dao  = new TtdFrontDaoImpl();
	
	
	
	@Test
	public void getFormulaData() {
		String convertedUnit = "km-meter";
		String formula = dao.getFormula(convertedUnit);
		
		System.out.println("getting formula from crud service::"+formula);
		 Assert.assertEquals("*1000",formula );
		
	}
	
	
	
	
	
	

}
