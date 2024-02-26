package com.bdd.ReqRes.GET;

import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class GetSetCookie {
    @Test
    public void validateCookies(){
        Response response=given().
                baseUri("https://postman-echo.com").
                auth().basic("postman", "password").
                cookie("Cookie", "sails.sid=s%3A9JSbahYTjo6QjzEFaswZavN1AXzry3SH.XCkfqTb5TVyhxDhr5fGxls39EeGz7e86tR7Go%2Bceox4").
        when().
                get("/basic-auth").
        then().
                extract().response();

        String responseCookie = response.getCookie("sails.sid");
        System.out.println("Cookie: "+responseCookie);
    }
}
