package com.automationpractice.PageObject;

import com.automationpractice.Utilities.UserAction;
import org.openqa.selenium.By;

class Home {

    private final By Obj_SignIn_link = By.linkText("Sign in");

    private final UserAction action;

    public Home(UserAction action) {
        this.action = action;
    }

    public SignIn clickSignIn() {
        action.click(Obj_SignIn_link);
        return new SignIn(action);
    }


}
