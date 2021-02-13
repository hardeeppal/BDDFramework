Feature: Free CRM, Login Feature

  Scenario Outline: Free CRM Login Test Scenario
    Given User is already on Login Page
    When title of oddoo Website
    Then user enters "<username>" and "<password>"
#    Then user clicks on login button
    Then user is on home page

    Examples:
      | username  | password |
    | kainthhardeep276@gmail.com  | Automation123 |