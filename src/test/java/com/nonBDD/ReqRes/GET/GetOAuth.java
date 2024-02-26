package com.nonBDD.ReqRes.GET;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GetOAuth
{
    @Test
    public void vailidateOAuth(){
        RestAssured.baseURI="https://api.github.com";

        Response response=RestAssured.given().
                auth().oauth2("id").
                get("/user/repos");

        String id = response.jsonPath().getString("[0].id");
        Assert.assertEquals(id, "123");

    }
}
