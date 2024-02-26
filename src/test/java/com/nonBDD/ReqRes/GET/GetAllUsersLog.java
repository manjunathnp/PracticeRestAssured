package com.nonBDD.ReqRes.GET;

import com.infos.Creds;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class GetAllUsersLog {
    @Test
    public void validateGetAllUsersLog(){
        RestAssured.baseURI= Creds.reqResBaseURI;

        Response response=RestAssured.get(Creds.reqRestGetAllUsersEndpoint);

        System.out.println("Response Status Code: "+response.statusCode());
        System.out.println("Response Body: "+response.body().asPrettyString());
        System.out.println("Response Headers: "+response.headers());
    }
}
