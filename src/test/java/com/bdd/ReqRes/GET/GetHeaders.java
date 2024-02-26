package com.bdd.ReqRes.GET;

import com.infos.Creds;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class GetHeaders {
    @Test
    public void validateGetHeaders(){
        Response response=given().
                baseUri(Creds.reqResBaseURI).
        when().
                get(Creds.reqRestGetAllUsersEndpoint).
        then().
                extract().response();

        Headers headers = response.getHeaders();
        for(Header header:headers)
            System.out.println(header.getName()+": "+header.getValue());

    }
}
