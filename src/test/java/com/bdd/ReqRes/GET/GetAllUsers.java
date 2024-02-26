package com.bdd.ReqRes.GET;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;


import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.given;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class GetAllUsers {

    //@Test
    public void validateStatusCodeGetAllUsers(){
        RestAssured.baseURI = "https://reqres.in/api";

        Response response = get("/users?page=2").
                then().
                extract().response();

         response.getStatusCode();

        //assertThat(response.getStatusCode(),equalTo(200));
        Assert.assertEquals(response.getStatusCode(), 200, "Status code must be 200");
    }

    @Test
    public void validateStatusCodeGetAllUsers2(){
        given().
                baseUri("https://reqres.in/api").
        when().
                get("/users?page=2").
        then().
                assertThat().statusCode(200);

    }
}
