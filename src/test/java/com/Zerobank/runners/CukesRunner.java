package com.Zerobank.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "json:target/cucumber.json",
                "html:target/default-cucumber-reports",
                "rerun:target/rerun.txt"},
        features = "src/test/resources/features",
        glue = "/com/Zerobank/StepDefinitions",
        dryRun = true,
        tags = "@account_types "
)

public class CukesRunner {
}
