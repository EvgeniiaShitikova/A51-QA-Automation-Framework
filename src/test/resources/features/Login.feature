Feature: Login feature

  Scenario: Login Success
    Given I open Login Page
    When I enter email "evgeniia.shitikova@testpro.io"
    And I enter password "TridY6F2"
    And I submit
    Then I should get logged in

  Scenario Outline: Login Incorrect Password
    Given I open Login Page
    When I enter email "<email>"
    And I enter password "<password>"
    And I submit
    Then I should get logged in

    Examples:
      | email                         | password |
      | evgeniia.shitikova@testpro.io | TridY6F2 |
      | shitikova@testpro.io          | TridY6F2 |
      | evgeniia.shitikova@testpro.io | Y6F2     |
      | evgeniia.shitikova@testpro.io |          |