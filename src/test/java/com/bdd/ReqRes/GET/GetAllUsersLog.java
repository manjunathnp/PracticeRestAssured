package com.bdd.ReqRes.GET;

import com.infos.Creds;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;

public class GetAllUsersLog {
    @Test
    public void validateGetLogAll(){
        given().
                baseUri(Creds.reqResBaseURI).
                log().all().
        when().
                get(Creds.reqRestGetAllUsersEndpoint).
        then().
                assertThat().
                statusCode(200).
                log().all();
    }
}
