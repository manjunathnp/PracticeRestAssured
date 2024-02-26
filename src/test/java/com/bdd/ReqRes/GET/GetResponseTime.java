package com.bdd.ReqRes.GET;

import com.infos.Creds;
import io.restassured.RestAssured;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.lessThan;

public class GetResponseTime {

    @Test
    public void validateResponseTime(){
        given().
                baseUri(Creds.reqResBaseURI).
        when().
                get(Creds.reqRestGetAllUsersEndpoint).
        then().
                time(lessThan(500L));

    }
}
