package com.nonBDD.ReqRes.GET;

import com.infos.Creds;
import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class GetHeaders {
    @Test
    public void validateHeaders(){
        RestAssured.baseURI= Creds.reqResBaseURI;

        Response response=RestAssured.get(Creds.reqRestGetAllUsersEndpoint);
        Headers headers=response.headers();

        for(Header header:headers)
            System.out.println(header.getName()+": "+header.getValue());
    }
}
