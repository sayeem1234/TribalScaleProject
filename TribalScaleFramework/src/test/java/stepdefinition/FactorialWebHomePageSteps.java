package stepdefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import framework.webPages.HomePage;
import org.testng.Assert;

/**
 * Created by Shadidul Hossain
 */

public class FactorialWebHomePageSteps {

    private HomePage homePage = new HomePage();


    @Given("^I am on Factorial Home Page$")
    public void iAmOnFactorialHomePage() {
        Assert.assertEquals(SharedSD.getDriver().getTitle(), "Factoriall", "Invalid Home Page");
    }

    @Given("^user enters negative integer (.+) into the textfield$")
    public void enterIntegerFactorialTextField(String factorialNumber) {
        homePage.enterTextFactorialCalculator(factorialNumber);

    }

    @And("^user clicks the Calculate button$")
    public void clickCalculateButton() {
        homePage.clickCalculateButton();

    }

    @And("^I verify that the user receives an error message indicating that negative integers are not allowed in the factorial calculator$")
    public void verifyFactorialResult() {
        homePage.verifyFactorialResultTextMessage();

    }

    @Given("^I click on Terms and Conditions HyperLink$")
    public void clickTermsandConditionsHyperLink() {
        homePage.clickTermsandConditionsHyperLink();

    }

    @Given("^I click on Privacy HyperLink$")
    public void clickPrivacyHyperLink() {
        homePage.clickPrivacyHyperLink();

    }

    @Given("^the I see a message indicating that I am on the Terms and Conditions document$")
    public void verifyTermsandConditions() {
        homePage.VerifyTermsandConditionsHyperlink();

    }

    @Given("^the I see a message indicating that I am on the Privacy document$")
    public void verifyPrivacy() {
        homePage.VerifyPrivacyHyperlink();

    }

    @Given("^I do not see a message indicating that I am on the privacy document$")
    public void NoPrivacyOnTermsandConditionsDoc() {
        homePage.VerifyPrivacyDoesNotExistOnTermsConditionsDoc();

    }

    @Given("^I do not see a message indicating that I am on the Terms and Conditions document$")
    public void NoTermsandConditionsonPrivacyDoc() {
        homePage.VerifyTermsAndConditionsDoesNotExistOnPrivacyDoc();

    }









}
