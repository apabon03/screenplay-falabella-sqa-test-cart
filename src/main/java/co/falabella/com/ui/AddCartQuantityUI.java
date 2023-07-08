package co.falabella.com.ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class AddCartQuantityUI {
    public static Target TXT_QUANTITY = Target.the("Add Cart")
            .located(By.id("quantity-selector-increment-input"));

    public static Target LBL_TITLE_PRODUCT_SELECTED = Target.the("Title Product")
            .locatedBy("//div[contains(@class, 'jsx-1442607798')]");
    public static Target BTN_CLICK_ADD = Target.the("Add Cart")
            .located(By.id("add-to-cart-button"));

    public static Target BTN_GO_TO_CART = Target.the("Go Cart")
            .located(By.id("linkButton"));



}
