package co.falabella.com.interactions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;


import static co.falabella.com.ui.AddCartQuantityUI.LBL_TITLE_PRODUCT_SELECTED;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class GetNameProduct implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor){
        WebElementFacade lblNameUI = LBL_TITLE_PRODUCT_SELECTED.resolveFor(actor);
        String lblNameProductSelected = lblNameUI.getText();
        actor.remember("lblNameProductSelected", lblNameProductSelected);

    }

    public static Performable title(){
        return instrumented(GetNameProduct.class);
    }

    public static String getNameProductSelected(Actor actor){
        return actor.recall("lblNameProductSelected");
    }

}


