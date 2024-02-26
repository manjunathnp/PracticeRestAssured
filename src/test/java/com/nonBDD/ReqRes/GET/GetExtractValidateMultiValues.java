package com.nonBDD.ReqRes.GET;

import com.infos.Creds;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GetExtractValidateMultiValues {
    @Test
    public void validateMultiResponseValues(){
        RestAssured.baseURI= Creds.reqResBaseURI;

        Response response=RestAssured.get(Creds.reqRestGetAllUsersEndpoint);

        Assert.assertEquals(response.jsonPath().getString("data[0].id"), "7");
        Assert.assertEquals(response.jsonPath().getString("data[0].first_name"), "Michael");
        Assert.assertEquals(response.jsonPath().getString("data[0].last_name"), "Lawson");
    }
}
