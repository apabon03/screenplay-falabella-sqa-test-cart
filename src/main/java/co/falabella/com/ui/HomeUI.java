package co.falabella.com.ui;

import net.serenitybdd.screenplay.targets.Target;

public class HomeUI {
    public static Target TXT_SEARCH=Target.the("textbox search")
            .locatedBy("//input[@id='testId-SearchBar-Input']");
}
