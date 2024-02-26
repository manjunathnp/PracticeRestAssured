package com.bdd.ReqRes.GET;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class GetStatusCode {

    @Test
    public void statusCodeValidation(){
        given().
                baseUri("https://reqres.in/api").
        when().
                get("/users?page=2").
        then().
                assertThat().statusCode(200);
    }

}
