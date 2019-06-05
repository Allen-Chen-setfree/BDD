package com.automationpractice.PageObject;

import com.automationpractice.Utilities.UserAction;
import org.openqa.selenium.By;

public class SignIn {

    private final By Obj_emailCreate_input = By.id("email_create");
    private final By Obj_submitCreate_button = By.id("SubmitCreate");

    UserAction action;
    public SignIn( UserAction action) {
        this.action = action;
    }

    public SignIn input_Email_Create(String email) {
        action.input(Obj_emailCreate_input,email);
        return this;
    }

    public RegisterPage click_create_account_button () {
        action.click(Obj_submitCreate_button);
        return new RegisterPage(action);
    }

}
