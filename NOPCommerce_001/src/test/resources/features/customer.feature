Feature: Customers

Background: Below are the common steps for each scenario
    Given User launch chrome browser
    When User opens URL "https://admin-demo.nopcommerce.com/"
    And User enter Email as "admin@yourstore.com" and Password as "admin"
    And Click on login
    Then user can view Dashboad
  
  
  
  Scenario: Add a new customer
     When user click on customer Menu
    And click on customer Menu item
    And click on Add new button
    Then user can view Add new customer page
    And click on save button
    Then user can view confirmation message " The new customer has been added successfully."
    And close browser

  Scenario: Search Customer by EmailID
    When user click on customer Menu
    And click on customer Menu item
    And Enter user email
    When Click on seach button
    Then User should found Email in the search table
    And close browser

  #Scenario: Search customer by name
    #When user click on customer Menu
    #When user click on customer Menu
    #And Enter customer firstname
    #And Enter customer lastname
    #When Click on seach button
    #Then User should found1 Email in the search table
    #And close browser
