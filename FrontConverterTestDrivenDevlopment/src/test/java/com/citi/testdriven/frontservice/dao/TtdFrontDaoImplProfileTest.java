package com.citi.testdriven.frontservice.dao;

import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringRunner;

import com.citi.testdriven.frontservice.dao.TtdFrontDao;

/*@SpringBootTest
@RunWith(SpringRunner.class)
@ExtendWith(SpringExtension.class)
@ActiveProfiles(value = "test")*/
public class TtdFrontDaoImplProfileTest {
	
	@Autowired
	TtdFrontDao dao ;
	

	//@Test
	public void testProfile() {
		String convertedUnit ="km-meter";
				
		System.out.println("inside TtdFrontDaoImplProfileTest::"
		+dao.getFormula(convertedUnit));
		
		
	}

}
