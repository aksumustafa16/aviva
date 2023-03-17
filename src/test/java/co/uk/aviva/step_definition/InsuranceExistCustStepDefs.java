package co.uk.aviva.step_definition;


import co.uk.aviva.pages.LoginPage;
import co.uk.aviva.utilites.BrowserUtils;
import co.uk.aviva.utilites.ConfigurationReader;
import co.uk.aviva.utilites.Driver;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class InsuranceExistCustStepDefs {

    @When("the user navigates to all Insurance buttons 141")
    public void the_user_navigates_to_all_Insurance_buttons141() {

        Driver.get().manage().window().maximize();
        Driver.get().get(ConfigurationReader.get("url"));
        BrowserUtils.waitForClickablility(new LoginPage().acceptCookies, Duration.ofSeconds(10)).click();
        BrowserUtils.waitForClickablility(new LoginPage().insurance, Duration.ofSeconds(10)).click();
        WebElement tabElement = Driver.get().findElement(By.xpath("(//a[@class='a-button a-button--tertiary'])[30]"));
        BrowserUtils.waitForClickablility(tabElement, Duration.ofSeconds(10)).click();
        Assert.assertTrue("Actual Title: " + Driver.get().getTitle(), Driver.get().getTitle().contains(ConfigurationReader.get("30")));
        Driver.closeDriver();
    }

    @When("the user navigates to all Insurance buttons 142")
    public void the_user_navigates_to_all_Insurance_buttons142() {

        Driver.get().manage().window().maximize();
        Driver.get().get(ConfigurationReader.get("url"));
        BrowserUtils.waitForClickablility(new LoginPage().acceptCookies, Duration.ofSeconds(10)).click();
        BrowserUtils.waitForClickablility(new LoginPage().insurance, Duration.ofSeconds(10)).click();
        WebElement tabElement = Driver.get().findElement(By.xpath("(//a[@class='a-button a-button--tertiary'])[31]"));
        BrowserUtils.waitForClickablility(tabElement, Duration.ofSeconds(10)).click();
        Assert.assertTrue("Actual Title: " + Driver.get().getTitle(), Driver.get().getTitle().contains(ConfigurationReader.get("31")));
        Driver.closeDriver();
    }

    @When("the user navigates to all Insurance buttons 143")
    public void the_user_navigates_to_all_Insurance_buttons143() {

        Driver.get().manage().window().maximize();
        Driver.get().get(ConfigurationReader.get("url"));
        BrowserUtils.waitForClickablility(new LoginPage().acceptCookies, Duration.ofSeconds(10)).click();
        BrowserUtils.waitForClickablility(new LoginPage().insurance, Duration.ofSeconds(10)).click();
        WebElement tabElement = Driver.get().findElement(By.xpath("(//a[@class='a-button a-button--tertiary'])[32]"));
        BrowserUtils.waitForClickablility(tabElement, Duration.ofSeconds(10)).click();
        Assert.assertTrue("Actual Title: " + Driver.get().getTitle(), Driver.get().getTitle().contains(ConfigurationReader.get("32")));
        Driver.closeDriver();
    }

}
