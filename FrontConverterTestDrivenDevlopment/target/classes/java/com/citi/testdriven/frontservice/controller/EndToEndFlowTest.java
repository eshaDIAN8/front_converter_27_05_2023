package com.citi.testdriven.frontservice.controller;

import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;
public class EndToEndFlowTest {
	
	
	@Test
	public void getEndToEndTestFlowData() {
	
//hv to  read about how to call one service from another service at run time 
		//instead of callling each service manually..
		
        String fromUnit ="meter";
		 String toUnit ="cm";
		 String value ="8";
		RestAssured.baseURI="http://localhost:8089/converter/";
		String flow1_To_Flow2_TestResult = given().log().all()
				.when().get("meter/mm/8")
				.then().assertThat().log().all().statusCode(200).extract().response().asString();
		
		System.out.println("flow1 To Flow2 TestResult::"+flow1_To_Flow2_TestResult);
		
	
	}
	

}
