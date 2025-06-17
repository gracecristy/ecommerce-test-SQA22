Feature: Finish Checkout

  @PriorityTinggi
  Scenario: User menyelasaikan proses Checkout
    Given Tambah produk ke keranjang
    When Klik tombol Checkout
    And Masukkan informasi pelanggan
    And Klik tombol Finish
    Then User melihat pesan konfirmasi pemesanan