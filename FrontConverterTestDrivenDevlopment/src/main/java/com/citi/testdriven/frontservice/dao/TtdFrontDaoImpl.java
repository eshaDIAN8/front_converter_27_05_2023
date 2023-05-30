package com.citi.testdriven.frontservice.dao;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
//@Qualifier("ttdFrontDaoImpl")
@Profile({"!test"})
public class TtdFrontDaoImpl implements TtdFrontDao {
	
	
	@Autowired
    private RestTemplate restTmp =  new RestTemplate();
	
	private String formula;
	

public String getFormula(String convertedUnit) {
		
		try {
			
			//"http://localhost:"+ port + "/getConvertedUnit/meter-cm"
			 formula = restTmp.getForObject("http://localhost:8080/getConvertedUnit/"+convertedUnit, String.class);			
			// formula = restTmp.getForObject("http://localhost:"+ port + "/getConvertedUnit/"+convertedUnit, String.class);
			System.out.println("formula in front service:"+formula);
				}catch(Exception e) {
					System.out.println("exception at the time of crud microservice callng"+e);
				}
		
	return formula;
		}

}
