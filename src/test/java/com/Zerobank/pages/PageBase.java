package com.Zerobank.pages;

import com.Zerobank.utilities.BrowserUtils;
import com.Zerobank.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageBase {
    @FindBy(id = "account_summary_tab")
    public WebElement accountSummaryTab;
    @FindBy(id = "account_activity_tab")
    public WebElement accountActivityTab;
    @FindBy(id = "transfer_funds_tab")
    public WebElement transferFundsTab;
    @FindBy(id="pay_bills_tab")
    public WebElement payBillstab;
    @FindBy(id= "money_map_tab")
    public WebElement moneyMapTab;
    @FindBy(id="online_statements_tab")
    public WebElement onlineStatementsTab;
    public PageBase() {
        PageFactory.initElements(Driver.get(), this);
    }

//    public boolean verifyLogoDislayed() {
//        return brandLogo.isDisplayed();
//    }
//
//    public boolean verifySearchBarDisplayed() {
//        return searchBar.isEnabled();
//    }
//
//    public void logout() {
//        usernameBar.click();
//        BrowserUtils.waitForClickablility(logoutButton,10);
//        logoutButton.click();
//    }
//
//
//    public String getUsername() {
//        BrowserUtils.waitForVisibility(usernameBar, 5);
//        return usernameBar.getText();
//    }

    public void navigateTo(String tab){
        Driver.get().findElement(By.xpath("//a[text()='" + tab + "']")).click();
    }

}
