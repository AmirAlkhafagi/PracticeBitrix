package com.bitrix.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        publish = true,
        plugin = "html:target/cucumber.html",
        features = "src/test/resources/features",
        glue = "com/bitrix/step_definitions",
        dryRun = false,

        tags = " @fatih"

        tags = "@negative_scenario_outline"


)
public class CukesRunner {
}
