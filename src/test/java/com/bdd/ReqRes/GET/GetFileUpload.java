package com.bdd.ReqRes.GET;

import com.infos.Creds;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;

public class GetFileUpload {
    @Test
    public void validateFileUpload(){
        given().
                baseUri(Creds.testMockURI).
                multiPart("file", "/Users/manjunathnp/Documents/NPMN/Courses/POSTMAN/Resources/test.rtf").
        when().
                post("/file/upload").
        then().
                assertThat().
                statusCode(200);
    }
}
