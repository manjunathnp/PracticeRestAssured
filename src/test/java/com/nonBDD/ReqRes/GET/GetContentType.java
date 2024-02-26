package com.nonBDD.ReqRes.GET;

import com.infos.Creds;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class GetContentType {
    @Test
    public void validateGetContentType(){
        RestAssured.baseURI= Creds.reqResBaseURI;

        Response response=RestAssured.get(Creds.reqRestGetAllUsersEndpoint);

        System.out.println("Content-Type: "+response.getContentType());
        System.out.println("Content-Type: "+response.getHeader("Content-Type"));
    }
}
