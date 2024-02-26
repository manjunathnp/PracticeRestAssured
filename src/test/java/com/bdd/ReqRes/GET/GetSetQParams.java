package com.bdd.ReqRes.GET;

import com.infos.Creds;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class GetSetQParams {
    @Test
    public void validateSettingQParams(){
        given().
                baseUri(Creds.reqResBaseURI).
                log().all().
        when().
                queryParam("page", "3").
                get("/users").
        then().
                statusCode(200).
                log().body();
    }
}
