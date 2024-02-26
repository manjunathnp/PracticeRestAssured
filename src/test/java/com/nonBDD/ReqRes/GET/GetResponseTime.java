package com.nonBDD.ReqRes.GET;

import com.infos.Creds;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GetResponseTime {
    @Test
    public void validateResponseTime(){
        RestAssured.baseURI= Creds.reqResBaseURI;

        Response response=RestAssured.get(Creds.reqRestGetAllUsersEndpoint);

        long responseTime=response.getTime();
        Assert.assertTrue(responseTime<500L, "Response Time must be less than 500ms");
    }
}
