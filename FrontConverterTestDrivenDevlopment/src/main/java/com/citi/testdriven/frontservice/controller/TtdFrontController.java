package com.citi.testdriven.frontservice.controller;

import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.citi.testdriven.frontservice.dao.TtdFrontDao;
import com.citi.testdriven.frontservice.service.TtdFrontService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
@RequestMapping("/converter")
public class TtdFrontController {
	
	@Autowired
	TtdFrontService service ;
	

	
	
	@GetMapping("/{fromUnit}/{toUnit}/{value}")
	public ResponseEntity<String> getFormulaFromCrud(@PathVariable String fromUnit,
			@PathVariable String toUnit,@PathVariable double value) throws JsonProcessingException, JSONException {
		
		
		String convertedUnit = fromUnit+"-"+toUnit;
		
	
	Double convertedResult =  service.getConvertedResult(convertedUnit,value);
	System.out.println("inside front controller "+convertedResult);
	
	String convertedResult1 = String.valueOf(convertedResult);
	System.out.println(convertedResult1);
	
	return ResponseEntity.ok(convertedResult1);
		
	}
	
	

}
