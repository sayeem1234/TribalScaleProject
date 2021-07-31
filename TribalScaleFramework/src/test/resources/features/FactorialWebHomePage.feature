@web @regression @FactorialHomePage
Feature: Validate Elements on Factorial Home Page UI

  Background:
    Given I am on Factorial Home Page

  @factorialTextInput
  Scenario: Verify Invalid Integer Input into Factorial Calculator results in Invalid Message to User
    When user enters negative integer -5 into the textfield
    And user clicks the Calculate button
    Then I verify that the user receives an error message indicating that negative integers are not allowed in the factorial calculator


  @TermsandConditionsDoc
  Scenario: Verify clicking on Terms and Conditions Document hyperlink navigates user to Terms and Condition Document
    When I click on Terms and Conditions HyperLink
    Then the I see a message indicating that I am on the Terms and Conditions document
    And I do not see a message indicating that I am on the privacy document


  @PrivacyDoc
  Scenario: Verify clicking on Privacy Document hyperlink navigates user to Privacy Document
    When I click on Privacy HyperLink
    Then the I see a message indicating that I am on the Privacy document
    And I do not see a message indicating that I am on the Terms and Conditions document
