package com.nonBDD.ReqRes.GET;

import com.infos.Creds;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.net.URI;

public class GetSetQParams {
    @Test
    public void validateSettingQParams(){
        RestAssured.baseURI= Creds.reqResBaseURI;

        Response response=RestAssured.given().
                param("page", "2").
                get("/users");

        System.out.println(response.getStatusCode());
        System.out.println("Response Body: "+response.getBody().asPrettyString());
    }
}
