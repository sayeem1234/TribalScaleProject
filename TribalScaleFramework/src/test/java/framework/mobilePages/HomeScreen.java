package framework.mobilePages;

import framework.AppiumWrapper;
import framework.MobileBasePage;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.testng.Assert;

public class HomeScreen extends MobileBasePage {

    MobileElement TermsAndConditionsHyperLinkMobileElement = (MobileElement)AppiumWrapper.getAppiumDriver().findElement(By.xpath("/html/body/div[2]/div/p[1]/a[1]"));
    MobileElement PrivacyHyperLinkMobileElement = (MobileElement)AppiumWrapper.getAppiumDriver().findElement(By.xpath("/html/body/div[2]/div/p[1]/a[2]"));
    By factorialTextResultText = By.xpath("//p[@id=\"resultDiv\"]");
    MobileElement factorialTextResultMessage = (MobileElement) AppiumWrapper.getAppiumDriver().findElement(factorialTextResultText);
    By CalculateButton = By.id("getFactorial");
    MobileElement calculateButton = (MobileElement) AppiumWrapper.getAppiumDriver().findElement(CalculateButton);
    By factorialTextField = By.id("number");
    MobileElement factorialTextInput = (MobileElement) AppiumWrapper.getAppiumDriver().findElement(factorialTextField);


    public void tapTermsandConditionsHyperLinkMobile(){

        tapOn(TermsAndConditionsHyperLinkMobileElement);
        MobileElement termsAndConditionsText =(MobileElement) AppiumWrapper.getAppiumDriver().findElement(By.xpath("//body[contains(text(),'This is the privacy document')]"));
        Assert.assertEquals(getTextFromElement(termsAndConditionsText),"This is the terms and conditions document. We are not yet ready with it. Stay tuned!","Bug: Terms and Condition not found");
        Assert.assertNotEquals(getTextFromElement(termsAndConditionsText),"This is the privacy document. We are not yet ready with it. Stay tuned!","Bug: expected Terms and Conditions Document but found Privacy Document");
    }


    public void tapCalculatebutton(){
        tapOn(calculateButton);
    }


    public void enterFactorialNumber(String factorialNumber){
        setValue(factorialTextInput,factorialNumber);
    }


    public void  verifyFactorialResultTextMessageMobile(){
        Assert.assertEquals(getTextFromElement(factorialTextResultMessage),"Invalid negative integer value. Please try again.","Bug found: The user does not see any error message on the UI when inputting negative integer value.");
    }


    public void clickPrivacyLinkMobile(){

        tapOn(PrivacyHyperLinkMobileElement);
       MobileElement privacyText =(MobileElement) AppiumWrapper.getAppiumDriver().findElement(By.xpath("//body[contains(text(),'This is the terms and conditions document')]"));
        Assert.assertEquals(getTextFromElement(privacyText),"This is the privacy document. We are not yet ready with it. Stay tuned!","Bug: Privacy not found");
        Assert.assertNotEquals(getTextFromElement(privacyText),"This is the terms and conditions document. We are not yet ready with it. Stay tuned!","Bug: expected Privacy Document but found Terms and Conditions Document");


    }


}
