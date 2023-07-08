package co.falabella.com.tasks;

import co.falabella.com.interactions.ClickRandom;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.waits.Wait;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.falabella.com.ui.CatalogueUI.LBL_NAME_PRODUCTS;
import static co.falabella.com.ui.TitleAndQuantityArticleUI.LBL_TITLE_VALIDATE_CART;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ProductListTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(

                WaitUntil.the(LBL_NAME_PRODUCTS, isClickable()).forNoMoreThan(15).seconds(),
                ClickRandom.click()
        );
    }

    public static Performable onProduct(){
        return instrumented(ProductListTask.class);
    }
}
