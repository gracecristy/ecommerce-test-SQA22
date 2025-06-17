package com.juaracoding.apitest.definitions;

import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class LogoutTest {

    @When("User berada di halaman produk setelah login")
    public void user_berada_di_halaman_produk_setelah_login() {
        System.out.println("LogoutTest::User di halaman produk");
    }

    @When("User klik tombol  menu dan klik tombol logout")
    public void user_klik_tombol_menu_dan_klik_tombol_logout() {
        System.out.println("LogoutTest::Klik menu dan logout");
    }

    @Then("User kembali ke halaman login")
    public void user_kembali_ke_halaman_login() {
        System.out.println("LogoutTest::Kembali ke halaman login");
    }
}
