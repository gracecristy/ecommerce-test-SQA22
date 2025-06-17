package com.juaracoding.apitest.definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class APIGroupListTest {
    RequestSpecification requestSpecification;
    Response response;
    ValidatableResponse validatableResponse;

//    @Before
//    public void setup() {
//        System.out.println("APIGroupListTest::setup()");
//
//        //  RestAssured.baseURI = "http://localhost:8000";
//    }

    @Given("Preparing header for authorization")
    public void prepareHeader() {
        System.out.println("APIGroupListTest::prepareHeader");

        //        System.out.println("APIGroupListTest::prepareHeader");
//        requestSpecification = RestAssured.given().header(
//                "Authorization",
//                "Token 66004ef1931dba16ac8c5ca466ae1db30c56eac9");
    }

    @When("I access group with credential")
    public void accessGroups() {
        System.out.println("APIGroupListTest::accessGroups");

        //        System.out.println("APIGroupListTest::accessGroups");
//        response = requestSpecification.when()
//                .get("/catalogs/groups/");
    }

    @Then("I received from the server")
    public void receivedFromServer() {
        System.out.println("APIGroupListTest::receivedFromServer");
//        response.then()
//                .statusCode(200)
//                .statusLine("HTTP/1.1 200 OK")
//                .body("count", CoreMatchers.instanceOf(Integer.class))
//                .body("next", CoreMatchers.anyOf(CoreMatchers.nullValue(),
//                        CoreMatchers.instanceOf(String.class)));
    }
}

