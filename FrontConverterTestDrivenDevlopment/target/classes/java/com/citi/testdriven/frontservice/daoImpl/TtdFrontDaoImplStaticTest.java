package com.citi.testdriven.frontservice.daoImpl;

import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.citi.testdriven.frontservice.dao.TtdFrontDao;

//@AutoConfigureMockMvc
@RunWith(MockitoJUnitRunner.class)
@ExtendWith(SpringExtension.class)
//@SpringBootTest
@ActiveProfiles(value = "test")
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class TtdFrontDaoImplStaticTest {
	
    @Value("${profile.property.value}")
    private String propertyString;
	
    @Mock
	TtdFrontDaoImpl daoImpl;
    
    @Mock
    TtdFrontDao dao;
		
	@Mock
	TtdFrontDaoImplStatic daoImplStatic;
	
	String convertedUnit = "km-meter";
	
	
	@Test
	public void getFormulaStaticData() {
		
		when(daoImpl.getFormula(convertedUnit)).thenReturn("*1000");
		
	}
	


}
