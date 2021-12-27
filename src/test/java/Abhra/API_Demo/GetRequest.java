package Abhra.API_Demo;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

public class GetRequest {

	public static void main(String[] args) {

		
		
		RestAssured.baseURI="http://google.com";
		given().queryParam("key", "qaclick123").header("content-Type", "application/json")
		.when().get("/maps/api/place/add/json");
	}
}