package com.bdd.ReqRes.GET;

import com.infos.Creds;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class GetSetPathParams {
    @Test
    public void validateSetPathParams(){
        given().
                baseUri(Creds.reqResBaseURI).
                log().uri().
        when().
                pathParams("id", 2).
                get("/users/{id}").

        then().
                extract().response();
    }
}
