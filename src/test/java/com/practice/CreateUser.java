package com.practice;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class CreateUser {
    @Test
    public void validatePOSTCreateUser(){

        /*String payload = "{\n" +
                "    \"name\": \"tester\",\n" +
                "    \"email\": \"tester@gmail.com\",\n" +
                "    \"gender\": \"male\",\n" +
                "    \"status\": \"active\"\n" +
                "}";*/

        given().
                baseUri("https://gorest.co.in").
                header("Authorization", "Bearer cba2e347da912a855bbeb0416c57529cc76322096caff21aad008f8830c01bf3").
                header("Content-Type", "application/json").
                body("{\"name\": \"tester\", \"email\": \"test1243er@gma45il.com\", \"gender\": \"male\", \"status\": \"active\"}").
        when().
                post("/public/v2/users").
        then().
                log().all().
                statusCode(201).
                extract().response();

    }
}
