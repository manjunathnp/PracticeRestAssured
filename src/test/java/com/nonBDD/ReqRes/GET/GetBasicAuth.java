package com.nonBDD.ReqRes.GET;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GetBasicAuth {

    @Test
    public void validateBasicAuth(){
        RestAssured.baseURI="https://postman-echo.com/";

        Response response=RestAssured.given().
                auth().basic("postman", "password").
                get("/basic-auth");

        Assert.assertEquals(response.jsonPath().getBoolean("authenticated"), true);
    }
}
