package com.testautomation.stepdefinations;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class stepdefinations {

    protected WebDriver driver;



    @Given("I want to launch browser")
    public void I_want_to_launch_browser() {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
    }
    @When("I am on homepage")
    public void i_am_on_homepage() {
        driver.get("https://www.pnc.com/en/personal-banking.html");

    }
    @Then("I want to verify the page")
    public void i_want_to_verify_the_page() {
        boolean status = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div/div/ div/div/div/div[1]/div/div/div[7]/div/div/div/div[2]/button/span")).isDisplayed();
        Assert.assertEquals(true, status);

    }

    @Then("I close the browser")
    public void i_close_the_browser() {
        // Write code here that turns the phrase above into concrete actions
        driver.quit();
    }
}

