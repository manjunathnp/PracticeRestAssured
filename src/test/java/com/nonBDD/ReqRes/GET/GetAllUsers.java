package com.nonBDD.ReqRes.GET;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GetAllUsers {


    @Test
    public void validateGetAllUsersStatusCode(){
        RestAssured.baseURI = "https://reqres.in/api";

        Response response=RestAssured.get("/users?page=2");
        int statusCode=response.getStatusCode();

        Assert.assertEquals(statusCode, 200, "Expected Status Code is 200");
    }
}
