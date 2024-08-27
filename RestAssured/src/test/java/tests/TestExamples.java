package tests;

import static org.testng.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;

public class TestExamples {
	
	//@Test
	public void test_1()
	{
		Response response=get("https://reqres.in/api/users?page=2");
		
		
		
		response.getStatusCode();
		response.getTime();
		System.out.println(response.getStatusCode());
		System.out.println(response);
		System.out.println(response.asString());
		System.out.println(response.getHeader("co"
				+ "ntent-type"));
		
		int statusCode=response.getStatusCode();
		
		Assert.assertEquals(statusCode, 200);

	}
	
	
	//@Test
	public void test2()
	{
		given().get("https://reqres.in/api/users?page=2").
		then().statusCode(200);
		
		
	}
	@Test
	public void test3()
	{
		//Map<String,Object> map = new HashMap<String,Object>();
		//map.put("hello", "hi");
		
		JSONObject ob=new JSONObject();
		ob.put("hello", "hi");

		System.out.println(ob);
		
		given().body(ob.toJSONString()).when().post("https://reqres.in/api/users").then().statusCode(201);
	}



	
	
}
