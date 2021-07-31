$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("FactorialWebHomePage.feature");
formatter.feature({
  "line": 2,
  "name": "Validate Elements on Factorial Home Page UI",
  "description": "",
  "id": "validate-elements-on-factorial-home-page-ui",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@web"
    },
    {
      "line": 1,
      "name": "@regression"
    },
    {
      "line": 1,
      "name": "@FactorialHomePage"
    }
  ]
});
formatter.before({
  "duration": 8349765239,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "I am on Factorial Home Page",
  "keyword": "Given "
});
formatter.match({
  "location": "FactorialWebHomePageSteps.iAmOnFactorialHomePage()"
});
formatter.result({
  "duration": 436683629,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "Verify Invalid Integer Input into Factorial Calculator results in Invalid Message to User",
  "description": "",
  "id": "validate-elements-on-factorial-home-page-ui;verify-invalid-integer-input-into-factorial-calculator-results-in-invalid-message-to-user",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 7,
      "name": "@factorialTextInput"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "user enters negative integer -5 into the textfield",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "user clicks the Calculate button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I verify that the user receives an error message indicating that negative integers are not allowed in the factorial calculator",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "-5",
      "offset": 29
    }
  ],
  "location": "FactorialWebHomePageSteps.enterIntegerFactorialTextField(String)"
});
formatter.result({
  "duration": 253547570,
  "status": "passed"
});
formatter.match({
  "location": "FactorialWebHomePageSteps.clickCalculateButton()"
});
formatter.result({
  "duration": 139257730,
  "status": "passed"
});
formatter.match({
  "location": "FactorialWebHomePageSteps.verifyFactorialResult()"
});
formatter.result({
  "duration": 48049892,
  "error_message": "java.lang.AssertionError: Bug found: The user does not see any error message on the UI when inputting negative integer value. expected [Invalid negative integer value. Please try again.] but found []\n\tat org.testng.Assert.fail(Assert.java:93)\n\tat org.testng.Assert.failNotEquals(Assert.java:512)\n\tat org.testng.Assert.assertEqualsImpl(Assert.java:134)\n\tat org.testng.Assert.assertEquals(Assert.java:115)\n\tat org.testng.Assert.assertEquals(Assert.java:189)\n\tat framework.webPages.HomePage.verifyFactorialResultTextMessage(HomePage.java:25)\n\tat stepdefinition.FactorialWebHomePageSteps.verifyFactorialResult(FactorialWebHomePageSteps.java:36)\n\tat ✽.Then I verify that the user receives an error message indicating that negative integers are not allowed in the factorial calculator(FactorialWebHomePage.feature:11)\n",
  "status": "failed"
});
formatter.after({
  "duration": 619674829,
  "status": "passed"
});
});