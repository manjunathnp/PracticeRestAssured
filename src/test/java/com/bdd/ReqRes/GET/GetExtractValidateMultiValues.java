package com.bdd.ReqRes.GET;

import com.infos.Creds;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class GetExtractValidateMultiValues {
    @Test
    public void validateMultiResponseValues(){
        given().
                baseUri(Creds.reqResBaseURI).
        when().
                get(Creds.reqRestGetAllUsersEndpoint).
        then().
                body("data[0].id", equalTo(7)).
                body("data[0].first_name", equalTo("Michael")).
                body("data[0].last_name", equalTo("Lawson"));

    }
}
