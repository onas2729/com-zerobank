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
    @Then("the user should see following account types")
    public void the_user_should_see_following_account_types(io.cucumber.datatable.DataTable dataTable) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.
        throw new cucumber.api.PendingException();
    }

}
