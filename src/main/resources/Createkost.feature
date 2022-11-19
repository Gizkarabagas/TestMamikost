Feature: createKost
  Background: user login as owner
    Given user navigate to homepage
    When user input owner account and password
    Then user successfully login as owner

  Scenario: user login and create kost
    Given user create kos
    When user fill Data kos
    And User fill alamat kos
    And user fill foto kos
    And user fill foto kamar
    And user fill fasilitas
    And user fill ketersediaan kamar
    Then user fill harga



