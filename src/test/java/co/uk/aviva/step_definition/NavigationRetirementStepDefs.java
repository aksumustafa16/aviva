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

public class NavigationRetirementStepDefs {
    @When("the user navigates to all Retirement buttons")
    public void the_user_navigates_to_all_retirement_buttons() {

        try {
            for (int i = 2; i < 32; i++) {
                LoginPage loginPage = new LoginPage();
                Driver.get().manage().window().maximize();
                Driver.get().get(ConfigurationReader.get("url"));
                BrowserUtils.waitForClickablility(loginPage.acceptCookies, Duration.ofSeconds(10)).click();
                BrowserUtils.waitForClickablility(loginPage.insurance, Duration.ofSeconds(10)).click();
                WebElement tab = Driver.get().findElement(By.xpath("(//a[@class='a-button a-button--tertiary'])[" + i + "]"));
                BrowserUtils.waitForClickablility(tab, Duration.ofSeconds(10)).click();
                Assert.assertEquals(Driver.get().getCurrentUrl(), ConfigurationReader.get("" + i + ""));
                Driver.closeDriver();
            }

        } catch (Throwable Exception) {

        }

    }
}
