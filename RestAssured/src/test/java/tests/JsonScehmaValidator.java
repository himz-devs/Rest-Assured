package tests;

import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;

import org.testng.annotations.Test;

public class JsonScehmaValidator {
	
	@Test
	public void test2()
	{
		given().get("https://reqres.in/api/users?page=2").
		then().assertThat().body(matchesJsonSchemaInClasspath("schema.json")).
		statusCode(200).log().all();
		
		
	}
}
