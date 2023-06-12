Feature: Title of your feature
  I want to use this template for my feature file

  Scenario Outline: Title of your scenario
    Given user is already on Login Page
    When title of login page is Free CRM
    Then user enters "<username>" and "<password>"
    Then user clicks on login button
    Then user is on home page
    Then Close the browser

    Examples: 
      | username | password    |
      | student  | Password123 |
      | student  | Password12  |
