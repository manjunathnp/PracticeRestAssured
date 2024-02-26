package com.practicereqres;

import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class GETAllUsers {

    @Test
    public void validateStatusCode(){
        Response response = given().
                baseUri("https://reqres.in/api/users?page=2").
                log().all().
        when().
                get().
        then().
                log().all().
                statusCode(200).
                extract().response();

        Assert.assertEquals(response.statusCode(), 200, "Expected Status Code is 200");
    }
}
