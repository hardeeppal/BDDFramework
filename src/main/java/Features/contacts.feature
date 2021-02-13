Feature: Free CRM create Contacts

  Scenario Outline: Free CRM create a new contact scenario

    Given user is already on Login Page
    When title of login page is Free CRM
    Then user enters "<username>" and "<password>"
    Then user clicks on login button
    Then user is on home page
    Then user moves to new contact page
    Then user enters contactDetails "<firstName>" and "<lastName>" and "<company>"
    Then Close the browser

    Examples:
      | username                    | password       | firstName | lastName | company  |
      | kainthhardeep276@gmail.com  | Automation123  | david     | steven   | electric |
      | kainthhardeep2732@gmail.com | Automation1234 | happy     | andrew   | tire     |