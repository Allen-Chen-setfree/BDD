package com.automationpractice.PageObject;

import com.automationpractice.Utilities.UserAction;
import org.openqa.selenium.By;

public class SummerDresses implements Base{


    private final By Obj_addToCart_button = By.linkText("Add to cart");
    private String item_link = "//*[@class='product-container']//*[contains(text(),'keyword')]";
    private final By Obj_addMsg_text = By.xpath(CART_PRODUCT + "/h2");
    private final By Obj_quantityAdded_text = By.xpath(CART_PRODUCT + "//*[text()='Quantity']/following-sibling::span");
    UserAction action;

    public SummerDresses(UserAction action) {
        this.action = action;
    }

    public SummerDresses moveToItem (String itemName) {

        By Object_item = By.xpath(item_link.replace("keyword",itemName));
        action.scrollToElementView(Object_item);
        action.hoverOn(Object_item);
        return this;

    }

    public SummerDresses addToCart() {
        action.click(Obj_addToCart_button);
        return this;
    }

    public String fectchMsgAfterAddItem() throws InterruptedException {
        action.waitTillVisibility(Obj_addMsg_text,10);
        action.waitTillValueFilled(Obj_addMsg_text,10);
        return action.getText(Obj_addMsg_text);
    }

    public int getNoAfterAddItem() {
        return Integer.parseInt(action.getText(Obj_quantityAdded_text).trim());
    }
}
