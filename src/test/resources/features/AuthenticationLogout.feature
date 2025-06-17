Feature: Logout User

  @PrioritySedang
  Scenario: User logout dari Sistem
    When User berada di halaman produk setelah login
    And User klik tombol  menu dan klik tombol logout
    Then User kembali ke halaman login