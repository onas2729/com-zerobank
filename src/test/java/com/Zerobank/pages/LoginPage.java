package com.Zerobank.pages;

import com.Zerobank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends PageBase {
    public LoginPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(id = "user_login")
    public WebElement usernameBox;

    @FindBy(id = "user_password")
    public WebElement passwordBox;

    @FindBy(name = "submit")
    public WebElement submitButton;

    @FindBy(css=".alert.alert-error")
    public WebElement errormessage;

    @FindBy (xpath ="//h3[contains(text(),\"Troubles\")]")
    public WebElement troublemessage;



    public void login(String username, String password){
        usernameBox.sendKeys(username);
        passwordBox.sendKeys(password);
        submitButton.click();
    }

    public boolean verifyAccountSummaryPage() {
        String expectedTitle = "Zero - Account Summary";
        String actualTitle = Driver.get().getTitle();
        boolean verification = expectedTitle.equals(actualTitle);
        return verification;
    }

    public boolean verifyTroubleShootMessage(){
        return troublemessage.isDisplayed();
    }
    public boolean verifyErrorMessageDisplayed(){
        return errormessage.isDisplayed();
    }



}

