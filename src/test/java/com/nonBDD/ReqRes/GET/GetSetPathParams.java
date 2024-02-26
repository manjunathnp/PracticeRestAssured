package com.nonBDD.ReqRes.GET;

import com.infos.Creds;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GetSetPathParams {
    @Test
    public void validateSetPathParams(){
        RestAssured.baseURI= Creds.reqResBaseURI;

        Response response=RestAssured.get("/users/{id}", 2);

        Assert.assertEquals(response.getStatusCode(), 200);
    }
}
