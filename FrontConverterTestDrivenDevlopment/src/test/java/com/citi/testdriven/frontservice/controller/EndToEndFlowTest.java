package com.citi.testdriven.frontservice.controller;



import io.restassured.RestAssured;


import static io.restassured.RestAssured.given;

import org.junit.Test;


public class EndToEndFlowTest {
	
	
      @Test
	public void getEndToEndTestFlowData() {
	
		
       
		RestAssured.baseURI="http://localhost:8089/converter/";
		String flow1_To_Flow2_TestResult = given().log().all()
				.when().get("meter/mm/8")
				.then().assertThat().log().all().statusCode(200).extract().response().asString();
		
		System.out.println("flow1 To Flow2 TestResult::"+flow1_To_Flow2_TestResult);
		
	
	}
	

}
