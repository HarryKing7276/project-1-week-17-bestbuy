package com.restful.booker.testbase;

import io.restassured.RestAssured;
import org.testng.annotations.BeforeClass;

public class TestBase {
    public static String basePath;

    @BeforeClass
    public static void inIt() {
        RestAssured.baseURI = "";
        RestAssured.basePath = "";
    }
}
