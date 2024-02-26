package com.nonBDD.ReqRes.GET;

import com.infos.Creds;
import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class GetFileUpload {
    @Test
    public void validateFileUpload(){
        RestAssured.baseURI= Creds.testMockURI;

        RequestSpecification requestSpecification=RestAssured.given();
        requestSpecification.multiPart("file", "/Users/manjunathnp/Documents/NPMN/Courses/POSTMAN/Resources/test.rtf");
        requestSpecification.post("/file/upload");
        requestSpecification.then().statusCode(200);


    }
}
