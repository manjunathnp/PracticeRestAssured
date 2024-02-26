package com.bdd.ReqRes.GET;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class GetSSLByPass {
    @Test
    public void validateSSLByPass(){
        given().
                relaxedHTTPSValidation().
                baseUri("https://reqres.in").
        when().
                get("api/users?page=2").
        then().
                assertThat().
                statusCode(200);

    }
}
