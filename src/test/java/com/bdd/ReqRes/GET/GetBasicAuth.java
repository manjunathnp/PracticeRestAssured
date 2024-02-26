package com.bdd.ReqRes.GET;

import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class GetBasicAuth {
    @Test
    public void validateBasicAuth(){
        Response response=given().
                baseUri("https://postman-echo.com/basic-auth").
                auth().basic("postman", "password").
        when().
                get().
        then().
                extract().response();

        assertThat(response.statusCode(), equalTo(200));
        assertThat(response.jsonPath().getString("authenticated"),equalTo("true"));
    }
}
