package com.testautomation.testrunner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(

        features = "/Users/vikashsharma/Documents/Automation_Testing/cucumberselenium/src/test/java/com/testautomation/FeatureFiles/loginPage.feature",
        glue = "com.testautomation.stepdefinations"
)
public class testrunner {
}
