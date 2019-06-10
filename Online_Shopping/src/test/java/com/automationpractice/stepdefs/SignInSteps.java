package com.automationpractice.stepdefs;

import com.automationpractice.Helper.TestContext;
import com.automationpractice.PageObject.RegisterPage;
import com.automationpractice.PageObject.SignIn;
import com.automationpractice.Utilities.Entry;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SignInSteps {
    private final TestContext testContext;
    private SignIn signIn;
    private RegisterPage registerPage;
    private final Entry entry;

    public SignInSteps(TestContext context){
        testContext=context;
        entry=context.getEntry();
    }

    @Given("^I am on the Sign In page: \"([^\"]*)\"$")
    public void i_am_on_the_page(String page) throws Exception {
        String url = entry.readProperty().get(page);
        signIn = new SignIn(
                entry.init().navToURL(url)
        );

    }

    @When("^I input i?n?correct email address \"([^\"]*)\" to create an account$")
    public void i_input_email_address_to_create_an_account(String email) {
        signIn.input_Email_Create(email);

    }

    @When("^I click the button \"([^\"]*)\"$")
    public void i_click_the_button(String arg1) {
        registerPage = signIn.click_create_account_button();

    }


    @Then("^I should navigate to register page$")
    public void i_should_navigate_to_register_page() {
        registerPage.verifyPage();
        entry.closeTab();
    }

    @Then("^I should see the error info \"([^\"]*)\"$")
    public void i_should_see_the_error_info(String errMsg) {
        registerPage.verifyErrorEmailInfo(errMsg);
        entry.closeTab();
    }



}
