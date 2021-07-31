@mobile @regressionMobile @FactorialHomePageMobile
Feature: Validate Elements on Factorial Home Page UI on Android Mobile Device

  Background:
    Given I am on Factorial Home Page Mobile

  @factorialTextInputMobile
  Scenario: Verify Invalid Integer Input into Factorial Calculator results in Invalid Message to User on Mobile Device
    When user enters negative integer -7 into the textfield on Mobile
    And user clicks the Calculate button on Mobile
    Then I verify that the user receives an error message indicating that negative integers are not allowed in the factorial calculator on Mobile


  @VerifyTermsandConditionsDocMobile
  Scenario: Verify clicking on Terms and Conditions Document hyperlink navigates user to Terms and Condition Document on Mobile Device
    When I tap on Terms and Conditions HyperLink Mobile
    Then I see a message indicating that I am on the Terms and Conditions document Mobile
    And I do not see a message indicating that I am on the privacy document Mobile

  @PrivacyDocValidationMobile
  Scenario: Verify clicking on Privacy Document hyperlink navigates user to Privacy Document
    When I click on Privacy HyperLink on Mobile
    Then the I see a message indicating that I am on the Privacy document on Mobile
   And I do not see a message indicating that I am on the Terms and Conditions document on Mobile
