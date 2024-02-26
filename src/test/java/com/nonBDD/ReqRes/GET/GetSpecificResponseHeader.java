package com.nonBDD.ReqRes.GET;

import com.infos.Creds;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class GetSpecificResponseHeader {
    @Test
    public void validateSpecificResponseHeader(){
        RestAssured.baseURI= Creds.reqResBaseURI;

        Response response=RestAssured.get(Creds.reqRestGetAllUsersEndpoint);
        System.out.println("Server: "+response.getHeader("Server"));
    }
}
