package com.nonBDD.ReqRes.GET;

import groovy.transform.ToString;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class GetSpecificResponseValue {
    @Test
    public void validateSpecificResponseValue(){
        RestAssured.baseURI="https://reqres.in/api";
        String specificResponseValue_email = "michael.lawson@reqres.in";

        Response response=RestAssured.get("/users?page=2");
        String actualResponseValue_email=response.jsonPath().getString("data[0].email");

        //Assert.assertEquals(actualResponseValue_email, specificResponseValue_email);
        assertThat(actualResponseValue_email,equalTo(specificResponseValue_email));
    }

    @Test
    public void validateSpecificResponseValue2(){
        RestAssured.baseURI="https://reqres.in/api";

        Assert.assertEquals(RestAssured.get("/users?page=2").jsonPath().getString("data[0].email"), "michael.lawson@reqres.in");
    }
}
