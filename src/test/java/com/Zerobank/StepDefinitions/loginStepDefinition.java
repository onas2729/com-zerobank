package com.Zerobank.StepDefinitions;

import com.Zerobank.pages.LoginPage;
import com.Zerobank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class loginStepDefinition {
    LoginPage loginPage = new LoginPage();

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {

        String expectedTitle = "Zero - Log in";
        String actualTitle = Driver.get().getTitle();

        Assert.assertEquals(expectedTitle, actualTitle);
    }

    @When("user enters {string} and {string} and clicks Sign in button")
    public void user_enters_and_and_clicks_Sign_in_button(String username, String password) {
        loginPage.login(username, password);
    }

    @Then("the page title should be Account summary page")
    public void the_page_title_should_be_Account_summary_page() {

        Assert.assertTrue("title is not matched", loginPage.verifyAccountSummaryPage());

    }



    @Then("user should not be able to login")
    public void user_should_not_be_able_to_login() {
loginPage.verifyTroubleShootMessage();
    }

    @Then("error message should be displayed")
    public void error_message_should_be_displayed() {
            loginPage.verifyErrorMessageDisplayed();
    }

}
