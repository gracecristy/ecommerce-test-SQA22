Feature: Proses Checkout

  @PriorityTinggi
  Scenario: User melanjutkan ke halaman proses Checkout
    Given Tambah produk ke keranjang
    When Klik tombol Checkout
    And Masukkan informasi pelanggan
    And Klik tombol Continue
    Then User diarahkan ke halaman proses Checkout