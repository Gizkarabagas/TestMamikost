Feature: Login and favorite

  Background: user login with as customer
    Given user navigate to homepage
    When user input noHp and password
    Then User successfully login

  Scenario: user login and favorite kos
    Given User in homepage
    When user login with phone number
    And user want to favorite kos
    And kos favorite
    Then unfavorite Kos

