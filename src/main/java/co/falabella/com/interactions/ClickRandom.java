package co.falabella.com.interactions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;

import java.util.List;
import java.util.Random;

import static co.falabella.com.ui.CatalogueUI.LBL_NAME_PRODUCTS;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ClickRandom implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor){

        List<WebElementFacade> listProducts = LBL_NAME_PRODUCTS.resolveAllFor(actor); //devuelve toda la coleccion
        Random random = new Random();
        int indexRandom = random.nextInt(listProducts.size());



        listProducts.get(indexRandom).click();



    }
    public static Performable click(){
      return instrumented(ClickRandom.class);
    };
}
