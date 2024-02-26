package com.nonBDD.ReqRes.GET;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GetSetCookie {

    @Test
    public void validateCookies(){
        RestAssured.baseURI="https://postman-echo.com";

        Response response=RestAssured.given().
                auth().basic("postman", "password").
                cookie("Cookie", "sails.sid=s%3A9JSbahYTjo6QjzEFaswZavN1AXzry3SH.XCkfqTb5TVyhxDhr5fGxls39EeGz7e86tR7Go%2Bceox4").
        when().
                get("/basic-auth").
        then().
                extract().response();

        System.out.println("Cookie: "+response.getCookie("sails.sid"));
        System.out.println(response.getCookies());
    }
}
