package co.falabella.com.ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class TitleAndQuantityArticleUI {

    public static Target LBL_TITLE_VALIDATE_CART = Target.the("Title Article")
            .located(By.xpath("//div/p[contains(@class, 'chakra-text css-1h76ti1')]"));

    public static Target LBL_QUANTITY_ARTICLES = Target.the("Button Quantity")
            .locatedBy("//div/span[@class='UserActions-module_has-count-desktop__202jS']");
}
