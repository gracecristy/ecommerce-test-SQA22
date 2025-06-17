package com.juaracoding.apitest.definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class CartTest {

    @Given("User sudah login dengan user valid")
    public void user_sudah_login_dengan_user_valid() {
        System.out.println("CartTest::User login valid");
    }

    @When("User klik tombol Add to Cart pada salah satu produk")
    public void user_klik_tombol_add_to_cart_pada_salah_satu_produk() {
        System.out.println("CartTest::Klik Add to Cart");
    }

    @When("Pengguna klik icon Cart")
    public void pengguna_klik_icon_cart() {
        System.out.println("CartTest::Klik icon cart");
    }

    @Then("Produk yang ditambahkan muncul di halaman Cart")
    public void produk_yang_ditambahkan_muncul_di_halaman_cart() {
        System.out.println("CartTest::Produk muncul di cart");
    }
}
