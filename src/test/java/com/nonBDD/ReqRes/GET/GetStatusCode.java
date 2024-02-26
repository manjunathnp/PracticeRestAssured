package com.nonBDD.ReqRes.GET;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class GetStatusCode {

    @Test
    public void validateStatusCode() {
        RestAssured.baseURI = "https://reqres.in/api";

        Response response = RestAssured.get("/users?page=2");

        assertThat(response.getStatusCode(), equalTo(200));
    }
}
