package com.juaracoding.apitest.definitions;

import io.cucumber.java.en.Then;

public class RegistrationTest {

    @Then("User should be redirected to the homepage")
    public void user_should_be_redirected_to_the_homepage() {
        System.out.println("RegistrationTest - Redirect ke homepage");
    }
}
