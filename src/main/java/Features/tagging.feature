#It is used for different tagging like smoke sanity and regression

#  We are giving tagging for each file so there is make sure tagging for each
Feature: Free CRM application testing

  @SmokeTest @RegressionTest
  Scenario: Login with correct username and correct password
    Given This is a valid login test

  @RegressionTest
  Scenario: Login with incorrect username and correct password
    Given This is a invalid login test

  @SmokeTest
  Scenario: Create a contact
    Given This is a contact test case

  @SmokeTest @RegressionTest
  Scenario: Create a deal
    Given This is a deal test case

  @RegressionTest

  Scenario: Create a tasks
    Given This is a tasks test case


  @RegressionTest
  Scenario: Create a case
    Given This is a case test case

  @SmokeTest @RegressionTest

  Scenario: Verify left panel links
    Given clicking on left panel links

  @SmokeTest @RegressionTest
  Scenario: Search a deal
    Given This is a search deal test

  @SmokeTest @RegressionTest
  Scenario: Search a contact
    Given This is a search contact test

  @SmokeTest @RegressionTest @End2End

  Scenario: Search a case
    Given This is a search case test

  @SmokeTest
  Scenario: Search a task
    Given This is a search task test

  @SmokeTest
  Scenario: Search a call
    Given This is a search call test

  @SmokeTest
  Scenario: Search a deal
    Given This is a search deal test


  @SmokeTest @RegressionTest @End2End
  Scenario: Search a email
    Given This is a search email test

  @SmokeTest @RegressionTest @End2End
  Scenario: Search a docs
    Given This is a search docs test

  @SmokeTest @RegressionTest @End2End

  Scenario: Search a forms
    Given This is a search forms test

  @RegressionTest @End2End
  Scenario: Search a report
    Given This is a search report test


  @End2End
  Scenario: Application logout
    Given This is a logout test