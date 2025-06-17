Feature: Tambah Produk ke Keranjang


  @PriorityTinggi
  Scenario: User menambahkan produk ke keranjang
    Given User sudah login dengan user valid
    When User klik tombol Add to Cart pada salah satu produk
    And Pengguna klik icon Cart
    Then Produk yang ditambahkan muncul di halaman Cart