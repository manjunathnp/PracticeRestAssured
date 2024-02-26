package com.bdd.ReqRes.GET;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class GetFilterLogging {
    @BeforeClass
    public void setUp(){
        RestAssured.filters(new RequestLoggingFilter(), new ResponseLoggingFilter());

        RestAssured.requestSpecification = new RequestSpecBuilder().
                            setBaseUri("https://reqres.in").
                            setContentType(ContentType.JSON).
                            build();

        RestAssured.responseSpecification = new ResponseSpecBuilder().build();
    }

    @Test
    public void validateFilters(){
        given().
        when().
                get("api/users?page=2").
       then().
                statusCode(200);
    }
}
