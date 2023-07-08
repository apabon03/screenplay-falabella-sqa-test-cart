package co.falabella.com.ui;

import net.serenitybdd.screenplay.targets.Target;


public class CatalogueUI {
    public static Target LBL_NAME_PRODUCTS = Target.the("Product List")
            .locatedBy(".pod-head a, div[id*='testId'] > .link-container > a");
}
