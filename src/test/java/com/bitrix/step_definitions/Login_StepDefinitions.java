package com.bitrix.step_definitions;

import com.bitrix.pages.LoginPage;
import com.bitrix.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Login_StepDefinitions {

    LoginPage loginPage = new LoginPage();

    @Given("user is on login page")
    public void user_is_on_login_page() {
        loginPage.getUrl();
    }

    @When("user enters correct credentials")
    public void user_enters_correct_credentials() {
        loginPage.login();
    }

    @Then("user should be able to see landing page")
    public void user_should_be_able_to_see_landing_page() {

        String expected = "(10) Portal";
        String actual = Driver.getDriver().getTitle();

        Assert.assertEquals("actual and expected titles did not match", expected, actual);
    }

    @When("user enters the wrong {string} or {string}")
    public void user_enters_the_wrong_or(String string, String string2) {
       loginPage.login(string, string2);
    }

    @Then("{string} message should show up")
    public void message_should_show_up(String expected) {
        String actualErrorText = loginPage.getErrorText();
        Assert.assertEquals("The error message does not show up. Verification failed!!!", actualErrorText, expected);
    }

}
