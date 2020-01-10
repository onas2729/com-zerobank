package com.Zerobank.StepDefinitions;

import com.Zerobank.utilities.BrowserUtils;
import com.Zerobank.utilities.ConfigurationReader;
import com.Zerobank.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

public class hooks {

    @Before
    public void setup(){
        Driver.get().manage().window().maximize();
        Driver.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Driver.get().get(ConfigurationReader.get("url"));
        Driver.get().findElement(By.id("signin_button")).click();

    }


    @After
    public void teardown(){
        BrowserUtils.waitFor(2);
        Driver.closeDriver();
    }
}
