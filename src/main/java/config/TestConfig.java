package config;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.testng.annotations.BeforeClass;
import io.restassured.RestAssured;

import static constants.Constants.RubVariable.path;
import static constants.Constants.RubVariable.server;
import static constants.Constants.Servers.REQUSTBIN_URL;
import static constants.Constants.Servers.SWAPI_URL;

public class TestConfig {

    protected RequestSpecification requestSpecificationForSwapiTests = new RequestSpecBuilder()
            .setBaseUri(SWAPI_URL)
            .build();

    protected RequestSpecification requestSpecificationXml = new RequestSpecBuilder()
            .addHeader("Content-type", "application/xml")
            .addCookie("testCookieXML")
            .setBaseUri(REQUSTBIN_URL)
            .build();

    protected RequestSpecification requestSpecificationJson = new RequestSpecBuilder()
            .addHeader("Content-type", "application/json")
            .addCookie("testCookieJSON")
            .build();

    protected ResponseSpecification responseSpecificationForGet = new ResponseSpecBuilder()
            .expectStatusCode(200)
            .build();

    protected ResponseSpecification responseSpecificationForPost = new ResponseSpecBuilder()
            .expectStatusCode(201)
            .build();

    @BeforeClass
    public void setUp(){
        RestAssured.baseURI = server;
        RestAssured.basePath = path;

    }
}
