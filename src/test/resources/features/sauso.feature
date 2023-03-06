Feature: saucedemo side aoutomation test

  Scenario: user should see the title as Swag Labs
    Given user on the login page
    Then user verify that title as Swag Labs

  Scenario: login button text is capitalized
    Given user on the login page
    Then user verify login button text is capitalized

  Scenario Outline: : user should Login with standard_user & secret_sauce
    Given user on the login page
    When user enter user name as "<productType>"
    And  user enter password as "secret_sauce"
    And  user click login button
    Then user should see the home page
    Then user should verify default filter dropdown is A-Z
    Examples:
      | productType             |
      | standard_user           |
      | locked_out_user         |
      | problem_user            |
      | performance_glitch_user |


  Scenario: user should add product to chart
    Given user on the login page
    When user enter user name as "standard_user"
    And  user enter password as "secret_sauce"
    And  user click login button
    And user click addChart button

  Scenario Outline: user should add product to chart
    Given user on the login page
    When user enter user name as "standard_user"
    And  user enter password as "secret_sauce"
    And  user click login button
    And user click addChart "<product>"
    Examples:
      | product                 |
      | Sauce Labs Backpack     |
      | Sauce Labs Bike Light   |
      | Sauce Labs Bolt T-Shirt |
  @smoke
  Scenario: user should add product to chart
    Given user on the login page
    When user enter user name as "standard_user"
    And  user enter password as "secret_sauce"
    And  user click login button
    And user click addChart product2
      | Sauce Labs Backpack     |
      | Sauce Labs Bike Light   |
      | Sauce Labs Bolt T-Shirt |

