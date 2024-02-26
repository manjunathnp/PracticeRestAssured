package com.practicereqres;


import io.restassured.RestAssured;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class BasicGetRequestBDD {

    @Test
    public void basicGetTest() {

        // Set the base URL
        RestAssured.baseURI = "https://reqres.in/api";

        // Send the GET request and validate the response
        given()
                .get("/users?page=2")
        .then()
                .assertThat()
                .statusCode(200)
                .and()
                .statusLine(equalTo("HTTP/1.1 200 OK"));
    }
}
