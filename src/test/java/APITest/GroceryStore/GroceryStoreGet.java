package APITest.GroceryStore;


import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class GroceryStoreGet {



    @Test
    public void allGet(){

      //  RestAssured.get("/allGrocery");

        given().
                get("/allGrocery").
        then().
        statusCode(200);
    }

    @Test
    public void simpleGet(){

        given().
                get("/allGrocery").
        then().
                statusCode(200).
                body("data[1]",equalTo("apple"));


    }

    @Test
    public void post(){

        Map<String,Object> map =new HashMap<String,Object>() ;
        map.put("id" , "4");
        map.put("name" , "string");
        map.put("price" , "12.3");
        map.put("stock" , "3");

        System.out.println(map);





    }



}
