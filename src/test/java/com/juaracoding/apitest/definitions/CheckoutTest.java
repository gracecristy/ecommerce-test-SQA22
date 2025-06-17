package com.juaracoding.apitest.definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class CheckoutTest {

    @Given("Tambah produk ke keranjang")
    public void tambah_produk_ke_keranjang() {
        System.out.println("CheckoutTest - Tambah produk ke keranjang");
    }

    @When("Klik tombol Checkout")
    public void klik_tombol_checkout() {
        System.out.println("CheckoutTest - Klik tombol Checkout");
    }

    @When("Masukkan informasi pelanggan")
    public void masukkan_informasi_pelanggan() {
        System.out.println("CheckoutTest - Masukkan informasi pelanggan");
    }

    @When("Klik tombol Finish")
    public void klik_tombol_finish() {
        System.out.println("CheckoutTest - Klik tombol Finish");
    }

    @Then("User melihat pesan konfirmasi pemesanan")
    public void user_melihat_pesan_konfirmasi_pemesanan() {
        System.out.println("CheckoutTest - Pesan konfirmasi muncul");
    }
}
