package com.bdd.ReqRes.GET;

import com.infos.Creds;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class GetContentType {
    @Test
    public void validateContentType(){
        Response response=given().
                baseUri(Creds.reqResBaseURI).
        when().
                get(Creds.reqRestGetAllUsersEndpoint).
        then().
                extract().response();

        //System.out.println("Content-Type: "+response.getContentType());
        System.out.println("Content-Type: "+response.getHeader("Content-Type"));
    }
}
