package com.Zerobank.pages;

import com.Zerobank.utilities.ConfigurationReader;
import com.Zerobank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends PageBase {
    @FindBy(id = "user_login")
    public WebElement usernameBox;
    @FindBy(id = "user_password")
    public WebElement passwordBox;
    @FindBy(name = "submit")
    public WebElement signinButton;
    public LoginPage(){
        PageFactory.initElements(Driver.get(), this);
    }
    public void Login(){
        usernameBox.sendKeys(ConfigurationReader.get("username"));
        passwordBox.sendKeys(ConfigurationReader.get("password"));
        signinButton.click();
    }



}

