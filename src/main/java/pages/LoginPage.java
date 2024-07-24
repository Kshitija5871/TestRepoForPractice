package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static util.TestUtil.*;
import static util.TestUtil.click;

public class LoginPage {
    String sheetName = "ADITO_CRM_TESTDATA";


    //Page factory : Object Repository

    @FindBy(xpath = "//input[@placeholder='User name']")
    WebElement emailTextBox;

    @FindBy(xpath = "//input[@placeholder='Password']")
    WebElement passwordTextBox;

    //    *************************************************** Common Method  ***************************************************************

    public void enterEmailAddress(String emailId) {
        waitForElementToBeDisplayed(emailTextBox);
        sendKeys(emailTextBox, emailId, "Entered " + emailId + " as Email address");
        sleep(1000);
//        click(nextButton, "clicked on the next button");
    }

    public void enterPassword(String password) {
        waitForElementToBeDisplayed(passwordTextBox);
        sendKeys(passwordTextBox, password, "Entered password for " + getPropertyValueByKey("email") + " user");
//        click(signInButton, "Sign in button clicked");
    }

    //    ***************************************************Test Implementation************************************************************

    public void successfulLogin(){
        waitForElementToBeDisplayed(emailTextBox);

    }

    public void navigationToOperationMenu(){

    }


}
