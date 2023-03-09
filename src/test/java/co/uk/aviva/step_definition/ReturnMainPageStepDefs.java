package co.uk.aviva.step_definition;

import co.uk.aviva.pages.LoginPage;
import co.uk.aviva.utilites.BrowserUtils;
import co.uk.aviva.utilites.ConfigurationReader;
import co.uk.aviva.utilites.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.time.Duration;

public class ReturnMainPageStepDefs {
    LoginPage loginPage = new LoginPage();
    @When("the user click the aviva logo")
    public void the_user_click_the_aviva_logo() {
        BrowserUtils.waitForClickablility(loginPage.avivaLogo, Duration.ofSeconds(10)).click();
    }

    @Then("the user go back to the main page")
    public void the_user_go_back_to_the_main_page() {
        Assert.assertEquals(ConfigurationReader.get("expectedAvivaLogo"), Driver.get().getCurrentUrl());

    }
}
