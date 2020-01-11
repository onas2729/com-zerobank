package com.Zerobank.StepDefinitions;

import com.Zerobank.pages.LoginPage;
import com.Zerobank.utilities.BrowserUtils;
import com.Zerobank.utilities.ConfigurationReader;
import com.Zerobank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class AccountSummaryStepDefinition {
    @Given("the user is logged in")
    public void the_user_is_logged_in() {
        LoginPage loginPage = new LoginPage();
        BrowserUtils.waitFor(2);
        loginPage.Login();
    }
}
