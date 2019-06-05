package com.automationpractice.stepdefs;

import com.automationpractice.PageObject.SummerDresses;
import com.automationpractice.Utilities.UserAction;
import com.automationpractice.PageObject.RegisterPage;
import com.automationpractice.PageObject.SignIn;


import com.automationpractice.Utilities.Entry;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
/*

public class Steps extends Entry {

//    UserAction action;

    @Before
    public void startBrowser() throws Exception {
        action = init();
    }

    @After
    public void closeBrowser() {
        closeTab();
    }

    @Given("^I am on the \"([^\"]*)\" page$")
    public void i_am_on_the_page(String page) throws Exception {
        // Write code here that turns the phrase above into concrete actions
        action.navToURL(websites.get(page));

    }

    @When("^I input i?n?correct email address \"([^\"]*)\" to create an account$")
    public void i_input_email_address_to_create_an_account(String email) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        (new SignIn(action)).input_Email_Create(email);
//        signIn = signIn.input_Email_Create(email);

    }

    @When("^I click the button \"([^\"]*)\"$")
    public void i_click_the_button(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        (new SignIn(action)).click_create_account_button();

    }


    @Then("^I should navigate to register page$")
    public void i_should_navigate_to_register_page() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        (new RegisterPage(action)).verifyPage();
    }

    @Then("^I should see the error info \"([^\"]*)\"$")
    public void i_should_see_the_error_info(String errMsg) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        (new RegisterPage(action)).verifyErrorEmailInfo(errMsg);
    }



    @When("^I add \"([^\"]*)\" into cart$")
    public void i_add(String itemName) throws Throwable {
        (new SummerDresses(action)).moveToItem(itemName).addToCart();
    }

    @Then("^I should see the info window \"([^\"]*)\"$")
    public void i_should_see_the_info_window(String msg) throws Throwable {
        String actMsg = (new SummerDresses(action)).fectchMsgAfterAddItem();
        Assert.assertEquals(msg,actMsg);
    }

    @Then("^\"([^\"]*)\" such item is added to card$")
    public void one_such_item_is_added_to_card(int quantity) throws Throwable {
        int actQuantity = (new SummerDresses(action)).getNoAfterAddItem();
        Assert.assertEquals(quantity,actQuantity);
    }


*/


//}
