package framework.webPages;

import org.openqa.selenium.By;
import org.testng.Assert;

public class HomePage extends BasePage {

    private By integerTextField = By.id("number");
    private By calculateButton = By.xpath("//button[text()='Calculate!']");
    private By resultText = By.xpath("//p[@id=\"resultDiv\"]");
    private By TermsandConditionsHyperLink = By.xpath("//a[contains(text(),'Terms')]");
    private By TermsandConditions_Text = By.xpath("//body[contains(text(),'This is the privacy document')]");
    private By PrivacyHyperLink = By.xpath("//a[contains(text(),'Privacy')]");
    private By Privacy_Text = By.xpath("//body[contains(text(),'This is the term')]");

    public void enterTextFactorialCalculator(String factorialNumber) {
        setValue(integerTextField, factorialNumber);
    }

    public void clickCalculateButton() {
        clickOn(calculateButton);
    }

    public void verifyFactorialResultTextMessage() {
        Assert.assertEquals(getTextFromElement(resultText), "Invalid negative integer value. Please try again.", "Bug found: The user does not see any error message on the UI when inputting negative integer value.");
    }

    public void VerifyTermsandConditionsHyperlink() {
        Assert.assertEquals(getTextFromElement(TermsandConditions_Text), "This is the terms and conditions document. We are not yet ready with it. Stay tuned!", "Bug: Terms and Condition not found");


    }

    public void VerifyPrivacyHyperlink() {
        Assert.assertEquals(getTextFromElement(Privacy_Text), "This is the privacy document. We are not yet ready with it. Stay tuned!", "Bug: Privacy document not found");


    }

    public void VerifyPrivacyDoesNotExistOnTermsConditionsDoc() {
        Assert.assertNotEquals(getTextFromElement(TermsandConditions_Text), "This is the privacy document. We are not yet ready with it. Stay tuned!", "Bug: expected Terms and Conditions Document but found Privacy Document");

    }


    public void VerifyTermsAndConditionsDoesNotExistOnPrivacyDoc() {
        Assert.assertNotEquals(getTextFromElement(Privacy_Text), "This is the terms and conditions document. We are not yet ready with it. Stay tuned!", "Bug: expected Privacy Document but found Terms and Conditions Document");

    }

    public void clickTermsandConditionsHyperLink() {
        clickOn(TermsandConditionsHyperLink);
    }

    public void clickPrivacyHyperLink() {
        clickOn(PrivacyHyperLink);
    }


}
