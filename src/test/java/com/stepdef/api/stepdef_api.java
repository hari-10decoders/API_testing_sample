package com.stepdef.api;

import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
public class stepdef_api {

	@When("I enter the URL endpoint and hit the endpoint for get")
	public void i_enter_the_url_endpoint_and_hit_the_endpoint_for_get() {
		given()
	 	.baseUri("https://reqres.in/api/")
	 	.log().all()
	 	.when().get("users/2")
	 	.then().log().all();
		}

	@When("I enter the URL endpoint and hit the endpoint for post")
	public void i_enter_the_url_endpoint_and_hit_the_endpoint_for_post() {
		given()
		.baseUri("https://reqres.in/api/")
		.header("Content-Type", "application/json")
		.body("{\r\n"
				+ "    \"name\": \"morpheus\",\r\n"
				+ "    \"job\": \"leader\"\r\n"
				+ "}")
		.log().all()
		.when().post("user").then().log().all();

	}

	@When("I enter the URL endpoint and hit the endpoint for put")
	public void i_enter_the_url_endpoint_and_hit_the_endpoint_for_put() {
		 given()
		.baseUri("https://reqres.in/api/")
		.header("Content-Type", "application/json")
		.body("{\r\n"
				+ "    \"name\": \"HARI\",\r\n"
				+ "    \"job\": \"QA\"\r\n"
				+ "}")
		.log().all()
				
		.when().put("user/2")
		.then().log().all();
	}

	@When("I enter the URL endpoint and hit the endpoint for delete")
	public void i_enter_the_url_endpoint_and_hit_the_endpoint_for_delete() {
		RestAssured.baseURI="https://reqres.in/api";
		RestAssured.basePath="user/2";
		
		Response response = given()
//		.baseUri("https://reqres.in/api/")
//		.log().all()
		.when().delete()
		.then()
		.statusCode(204)
		.statusLine("HTTP/1.1 204 No Content")
		.log().all()
		.extract().response();
		
		 String asPrettyString = response.asPrettyString();
		 System.out.println(asPrettyString);
		}
	



}
