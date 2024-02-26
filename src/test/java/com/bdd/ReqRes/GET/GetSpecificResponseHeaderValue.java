package com.bdd.ReqRes.GET;

import com.infos.Creds;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class GetSpecificResponseHeaderValue {
    @Test
    public void validateSpecificHeaderValue(){
        Response response=given().
                baseUri(Creds.reqResBaseURI).
        when().
                get(Creds.reqRestGetAllUsersEndpoint).
        then().
                extract().response();

        System.out.println("Server: "+response.getHeader("Server").toString());
    }
}
