package com.bdd.ReqRes.GET;

import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class GetOAuth {

    @Test
    public void validateOAuth(){
        Response response=given().
                baseUri("https://api.github.com").
                auth().
                oauth2("id").
        when().
                get("user/repos").
        then().
                extract().response();

       String id= response.jsonPath().getString("[0].id");
        System.out.println("ID: "+id);
        Assert.assertEquals(id, "123");
    }
}
