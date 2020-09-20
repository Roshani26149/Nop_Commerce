Feature: Login

  Scenario: Successful Login with valid credential
    Given User launch chrome browser
    When User opens URL "https://admin-demo.nopcommerce.com/"
    And User enter Email as "admin@yourstore.com" and Password as "admin"
    And Click on login
    Then Page title should be "Dashboard / nopCommerce administration"
    When User click on Log out link
    Then PAge title should be "Your store.Login"
    And close browser

  Scenario Outline: Login Data Driven
    Given User launch chrome browser
   When User opens URL "https://admin-demo.nopcommerce.com/"
    And User enter Email as "<email>" and Password as "<password>"
    And Click on login
    Then Page title should be "Dashboard / nopCommerce administration"
    When User click on Log out link
    Then PAge title should be "Your store.Login"
    And close browser

    Examples: 
      | email                | password |
      | admin@yourstore.com  | admin    |
      | admin1@yourstore.com | admin123 |
