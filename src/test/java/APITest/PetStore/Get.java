package APITest.PetStore;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.http.Method;



public class Get {

    @Test
    void availableFindByStatus(){

        //Specify base URI
        RestAssured.baseURI="https://petstore.swagger.io";

        //Request object
        RequestSpecification httpRequest=RestAssured.given();

        //Response object
        Response response=httpRequest.request(Method.GET, "/pet/findByStatus?status=available");

        //print response in console window

        String responseBody=response.getBody().asString();
        System.out.println(responseBody);


        //status code validation
        int statusCode=response.getStatusCode();
        System.out.println("status code is" + statusCode);
        Assert.assertEquals(statusCode,200);

        //status line verification
        String statusLine=response.getStatusLine();
        System.out.println(statusLine);
        Assert.assertEquals(statusLine,"HTTP/1.1 200 OK");



    }

    @Test
    void pendingFindByStatus(){

        //Specify base URI
        RestAssured.baseURI="https://petstore.swagger.io";

        //Request object
        RequestSpecification httpRequest=RestAssured.given();

        //Response object
        Response response=httpRequest.request(Method.GET, "/pet/findByStatus?status=pending");

        //print response in console window

        String responseBody=response.getBody().asString();
        System.out.println(responseBody);

        //status code validation
        int statusCode=response.getStatusCode();
        System.out.println("status code is" + statusCode);
        Assert.assertEquals(statusCode,200);

        //status line verification
        String statusLine=response.getStatusLine();
        System.out.println(statusLine);
        Assert.assertEquals(statusLine,"HTTP/1.1 200 OK");


    }

    @Test
    void soldFindByStatus(){

        //Specify base URI
        RestAssured.baseURI="https://petstore.swagger.io";

        //Request object
        RequestSpecification httpRequest=RestAssured.given();

        //Response object
        Response response=httpRequest.request(Method.GET, "/pet/findByStatus?status=sold");

        //print response in console window

        String responseBody=response.getBody().asString();
        System.out.println(responseBody);

        //status code validation
        int statusCode=response.getStatusCode();
        System.out.println("status code is" + statusCode);
        Assert.assertEquals(statusCode,200);

        //status line verification
        String statusLine=response.getStatusLine();
        System.out.println(statusLine);
        Assert.assertEquals(statusLine,"HTTP/1.1 200 OK");


    }

}
