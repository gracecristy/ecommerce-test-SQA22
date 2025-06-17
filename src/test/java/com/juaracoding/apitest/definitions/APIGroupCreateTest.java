package com.juaracoding.apitest.definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class APIGroupCreateTest {
    RequestSpecification requestSpecification;
    Response response;
    ValidatableResponse validatableResponse;


//    @Before
//    public void setup() {
//        System.out.println("APIGroupCreateTest::setup()");
////
////        RestAssured.baseURI = "http://localhost:8000";
//}

        @Given("Preparing header for create group")
        public void prepareHeader() {
            System.out.println("APIGroupCreateTest::prepareHeader");

        }
//         JSONObject payload = new JSONObject();
//        payload.put("title", "Mobil Dinas Java");
//        payload.put("origin", "Pemkot DKI Javarta");
//
//        System.out.println("APIGroupCreateTest::prepareHeader");
//
//        requestSpecification = RestAssured.given().header(
//                "Authorization",
//                "Token 66004ef1931dba16ac8c5ca466ae1db30c56eac9")
//                .contentType(ContentType.JSON)
//                .body(payload.toString());
//

        @When("I post data payload to server")
        public void requestToServer () {
            System.out.println("APIGroupCreateTest::requestToServer");
//        response = requestSpecification.when()
//                .post("/catalogs/groups/");
//
        }

        @Then("I received response 201 from the server")
        public void receivedFromServer () {
            System.out.println("APIGroupCreateTest::receivedFromServer");
        }
        //        response.then()
//                .statusCode(201)
//                .statusLine("HTTP/1.1 201 Created")
//                .body("id", CoreMatchers.instanceOf(Integer.class))
//                .body("title", CoreMatchers.instanceOf(String.class))
//                .body("origin", CoreMatchers.instanceOf(String.class))
//                .body("created_at", CoreMatchers.instanceOf(String.class))
//                .body("updated_at", CoreMatchers.instanceOf(String.class))
//                .body("owner", CoreMatchers.instanceOf(Integer.class));

    }

