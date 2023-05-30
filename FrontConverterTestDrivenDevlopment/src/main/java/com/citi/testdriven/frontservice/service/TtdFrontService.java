package com.citi.testdriven.frontservice.service;

import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.citi.testdriven.frontservice.dao.TtdFrontDao;

@Service
public class TtdFrontService {

	@Autowired
	private RestTemplate restTmp ;
	
	 //@Qualifier("ttdFrontDaoImplStatic")
	
		@Autowired
		TtdFrontDao dao  ;
	
	private double convertedresult;
	private double doubleValue;
	private String formula;
	private double processedResult ;
		
	
   
	
	public Double getConvertedResult(String convertedUnit,double value)  {
		
		try {
			formula =  dao.getFormula(convertedUnit);
			System.out.println(" inside getConvertedResult() formula ::"+formula);
			
			 convertedresult = getAfterProcessingResult(formula, value);
			 System.out.println("convertedresult:"+convertedresult);
			 
		} catch (Exception e) {
			
			System.out.println("caught exception at the time of getting formula from crud service::"+e);
		}
		return convertedresult;
	}
		
	public Double getAfterProcessingResult(String formula,double value) {
		try {
		
        if( formula.charAt(0)=='*') {
				
				formula = formula.replace("*", "");
				 doubleValue = Double.parseDouble(formula);
				 processedResult = value*doubleValue;
				 System.out.println(" inside service if processing result::"+processedResult);
				
			}
			else 
			{
				formula = formula.replace("/", "");
				 doubleValue = Double.parseDouble(formula);
				 processedResult = value/doubleValue;
				 System.out.println("  inside service else processing result"+processedResult);
			}
		
		}catch(Exception e) {
			System.out.println("exception in getAfterProcessingResult()::"+e);
			
		}
		
		
		
			return processedResult;
			
		
	}
		
	}


