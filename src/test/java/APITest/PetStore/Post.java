package APITest.PetStore;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.google.gson.JsonObject;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Post {

    @Test
    void petIdPost() {

        //Specify base URI
        RestAssured.baseURI="https://petstore.swagger.io";

        //Request object
        RequestSpecification httpRequest=RestAssured.given();

        JsonObject requestParams= new JsonObject();

        requestParams.put("id" , "1");
        requestParams.put("name" , "Sevcan");
        requestParams.put("status" , "available");

        httpRequest.header("Content--Type" , "application/json");

        httpRequest.body(requestParams.toJSONString());

        //Response object
        Response response=httpRequest.request(Method.POST, "/#/pet/updatePetWithForm");

        //print response in console window

        String responseBody=response.getBody().asString();
        System.out.println(responseBody);

        //status code validation
        int statusCode=response.getStatusCode();
        System.out.println("status code is" + statusCode);
        Assert.assertEquals(statusCode,201);


    }

}
