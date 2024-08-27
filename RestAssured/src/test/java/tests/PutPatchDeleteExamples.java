package tests;

import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class PutPatchDeleteExamples {
	
	//@Test
	public void test4Put()
	{
		//Map<String,Object> map = new HashMap<String,Object>();
		//map.put("hello", "hi");
		
		JSONObject ob=new JSONObject();
		ob.put("hello", "hi");

		System.out.println(ob);
		
		given().body(ob.toJSONString()).when().put("https://reqres.in/api/users/2").then().statusCode(200);
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
		
		
		
		when().delete("/users/2").then().statusCode(204);
	}

}


