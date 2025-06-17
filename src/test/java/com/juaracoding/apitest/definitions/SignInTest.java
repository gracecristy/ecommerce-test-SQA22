package com.juaracoding.apitest.definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SignInTest {
    @Given("User is on the signin page")
    public void user_is_on_the_signin_page() {
        System.out.println("SignInTest::step01 - Di halaman signin");
    }

    @When("User enters valid username and password")
    public void user_enters_valid_username_and_password() {
        System.out.println("SignInTest::step02 - Masukkan username dan password");
    }

    @And("User clicks the signin button")
    public void user_clicks_the_signin_button() {
        System.out.println("SignInTest::step03 - Klik tombol signin");
    }

    @Then("pengguna berhasil masuk ke halaman produk")
    public void pengguna_berhasil_masuk_ke_halaman_produk() {
        System.out.println("SignInTest::step04 - Berhasil masuk halaman produk");
    }
}

