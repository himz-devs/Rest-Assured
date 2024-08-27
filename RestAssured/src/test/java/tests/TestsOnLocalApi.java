package tests;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class TestsOnLocalApi {
	
	//@Test
		public void test2()
		{
			given().get("http://localhost:3000/users").
			then().statusCode(200).log().all();
			
			
		}
	//@Test
	public void test4Put()
	{
		//Map<String,Object> map = new HashMap<String,Object>();
		//map.put("hello", "hi");
		
		JSONObject ob=new JSONObject();
		ob.put("HELLO", "hi");
		ob.put("WHO", "hi");

		System.out.println(ob);
		
		given().body(ob.toJSONString()).when().post("http://localhost:3000/users").then().statusCode(201);
	}

	//@Test
	public void test4Patch()
	{
		//Map<String,Object> map = new HashMap<String,Object>();
		//map.put("hello", "hi");
		
		baseURI="https://reqres.in/api";
		
		JSONObject ob=new JSONObject();
		ob.put("hello", "hi");

		System.out.println(ob);
		
		given().body(ob.toJSONString()).when().patch("/users/2").then().statusCode(200);
	}
	
	@Test
	public void test4Delete()
	{
		//Map<String,Object> map = new HashMap<String,Object>();
		//map.put("hello", "hi");
		
		baseURI="https://reqres.in/api";
		
		
		
		when().delete("/users/4").then().statusCode(204);
	}

}




