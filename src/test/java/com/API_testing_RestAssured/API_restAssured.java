package com.API_testing_RestAssured;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class API_restAssured {
	
	public static void Get_API() {
		RestAssured.baseURI = "https://reqres.in/api";
		RequestSpecification specification = RestAssured.given();
		Response response = specification.request(Method.GET, "users?page=2");
		System.out.println(response.asString());
		System.out.println(response.getStatusLine());
		System.out.println("***********************");
		}
	
	public static void Post_API() {
		RestAssured.baseURI = "https://reqres.in/api";
		RequestSpecification body = RestAssured.given().header("Content-Type","application/json").body("{\r\n"
				+ "    \"name\": \"Dhoni\",\r\n"
				+ "    \"job\": \"CSK Captain\"\r\n"
				+ "}");		
		Response response = body.request(Method.POST ,"users");
		System.out.println(response.getStatusLine());
		System.out.println(response.asString());
		System.out.println("***********************");
	}
	
	public static void Put_API() {
		RestAssured.baseURI ="https://reqres.in/api";
		RequestSpecification body = RestAssured.given().header("Content-Type" ,"application/json").body("{\r\n"
				+ "    \"Location\": \"Chennai\",\r\n"
				+ "    \"Designation\": \"QA\"\r\n"
				+ "}");
		Response response = body.request(Method.PUT ,"users/2");
		System.out.println(response.asString());
		System.out.println(response.getStatusLine());
		System.out.println("***********************");
	}
	
	public static void Delete_API() {
		RestAssured.baseURI ="https://reqres.in/api";
		RequestSpecification body = RestAssured.given();
		Response response = body.request(Method.DELETE ,"users/2");
		System.out.println(response.asString());
		System.out.println(response.getStatusLine());
		System.out.println("***********************");
	}
	public static void main(String[] args) {
		Get_API();
		Post_API();
		Put_API();
		Delete_API();
		
	}
}
