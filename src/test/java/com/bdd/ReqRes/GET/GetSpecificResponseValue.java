package com.bdd.ReqRes.GET;

import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class GetSpecificResponseValue {
    @Test
    public void validateSpecificResponseValue(){

        String specificResponseValue_email = "michael.lawson@reqres.in";

        Response response=given().
                baseUri("https://reqres.in").
        when().
                get("api/users?page=2").
        then().
                extract().response();

        Assert.assertEquals
                (response.jsonPath().getString("data[0].email"), specificResponseValue_email);
        //assertThat(response.jsonPath().getString(""), equalTo(specificResponseValue_email));


    }

    @Test
    public void validateSpecificResponseValue2(){

        String specificResponseValue_email = "michael.lawson@reqres.in";

        given().
                baseUri("https://reqres.in").
        when().
                get("api/users?page=2").
        then().
                assertThat().
                body("data[0].email",equalTo(specificResponseValue_email));
    }
}
