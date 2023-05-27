package com.citi.testdriven.frontservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class TtdFrontService {

	@Autowired
	private RestTemplate restTmp ;
	
	private double convertedresult;
	private double doubleValue;
	private String formula;
		
	
	public Double getResult(String formula,double value) {
		
		
        if(formula.charAt(0)=='*') {
				
				formula = formula.replace("*", "");
				 doubleValue = Double.parseDouble(formula);
				 convertedresult = value*doubleValue;
				 System.out.println(" if convertedresult::"+convertedresult);
				
			}
			else 
			{
				formula = formula.replace("/", "");
				 doubleValue = Double.parseDouble(formula);
				 convertedresult = value/doubleValue;
				 System.out.println(" else converted result"+convertedresult);
			}
			
			return convertedresult;
			
		
		
		
	}

}
