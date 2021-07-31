package stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import framework.AppiumWrapper;
import framework.mobilePages.HomeScreen;
import org.testng.Assert;


public class FactorialMobileHomePageSteps {

    private HomeScreen homeScreen = new HomeScreen();

    @Given("^I am on Factorial Home Page Mobile$")
    public void verifyHomePageFactorial() {
        Assert.assertEquals(AppiumWrapper.getAppiumDriver().getTitle(), "Factoriall", "Invalid Home Page");

    }



    @When("^I tap on Terms and Conditions HyperLink Mobile$")
    public void tapTermsandConditionsHyperLinkMobile()  {
        homeScreen.tapTermsandConditionsHyperLinkMobile();

    }

    @When("^I see a message indicating that I am on the Terms and Conditions document Mobile$")
    public void verifyTermsAndConditionsMobile() throws InterruptedException {
    }

    @When("^I do not see a message indicating that I am on the privacy document Mobile$")
    public void verifyNoPrivacyonTermsAndConditionsMobile() throws InterruptedException {

    }



    @When("^user enters negative integer (.+) into the textfield on Mobile$")
    public void enterValueintoFactorialCalculatorMobile(String factorialNumber) throws InterruptedException {
        homeScreen.enterFactorialNumber(factorialNumber);

    }
    @When("^user clicks the Calculate button on Mobile$")
    public void tapCalculateMobile() throws InterruptedException {
        homeScreen.tapCalculatebutton();

    }
    @When("^I verify that the user receives an error message indicating that negative integers are not allowed in the factorial calculator on Mobile$")
    public void verifyFactorialResultTextMobile() throws InterruptedException {
        homeScreen.verifyFactorialResultTextMessageMobile();

    }


    @When("^I click on Privacy HyperLink on Mobile$")
    public void clickPrivacyLinkMobile() {
        homeScreen.clickPrivacyLinkMobile();

    }

    @When("^the I see a message indicating that I am on the Privacy document on Mobile$")
    public void verifyPrivacyDocMobile() {


    }

    @When("^I do not see a message indicating that I am on the Terms and Conditions document on Mobile$")
    public void verifyNoTermsandConditionsOnPrivacyDocMobile(){


    }







}
