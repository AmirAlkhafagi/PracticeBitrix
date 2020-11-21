package com.bitrix.step_definitions;

import com.bitrix.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class my_task_fatih {

    LoginPage loginPage = new LoginPage();

    @Given("User on the Library CT dashboard page")
    public void user_on_the_library_ct_dashboard_page() {
        loginPage.getUrl();
        loginPage.login();
    }



    @When("I click User module")
    public void i_click_user_module() {


    }
    @When("I will select librarian in the User Group dropbox")
    public void i_will_select_librarian_in_the_user_group_dropbox() {

    }

    @Then("I should be able to select librarian option")
    public void i_should_be_able_to_select_librarian_option() {


    }

}
