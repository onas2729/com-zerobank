package com.Zerobank.StepDefinitions;

import com.Zerobank.pages.LoginPage;
import com.Zerobank.utilities.BrowserUtils;
import com.Zerobank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class loginStepDefinition {
    LoginPage loginPage = new LoginPage();

    @Given("The user is on the login page")
    public void the_user_is_on_the_login_page() {
        String expectedTitle = "Zero - Log in";
        String actualTitle = Driver.get().getTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
    }

    @When("the user enters valid credentials")
    public void the_user_enters_valid_credentials() {
        loginPage.Login();
    }

    @When("clicks on sign in button")
    public void clicks_on_sign_in_button() {
        loginPage.signinButton.click();
    }

    @Then("the page title should be {string}")
    public void the_page_title_should_be(String expectedTitle) {
        BrowserUtils.waitFor(3);
        String actualTitle = Driver.get().getTitle();
        BrowserUtils.waitFor(3);
        Assert.assertEquals(expectedTitle, actualTitle);
    }
}










