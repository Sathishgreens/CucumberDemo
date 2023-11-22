Feature: Validate the fields in Login Page

  Background: User is on Facebook url
    Given Browser is Launched
    Then User loads Facebook url

  Scenario: Checking the user login fields
  Given user enters UserName and Password
  Then user clicks login button

  Scenario: Checking the Forgot Password
  Given user clicks forgot password
  When User Enters valid data
  Then Check User successfully resets the Paswword

  Scenario: Checking the Create New Account
  Given user clicks Create Account
  When User Enters valid data for Account Creation
  Then Check User successfully created account