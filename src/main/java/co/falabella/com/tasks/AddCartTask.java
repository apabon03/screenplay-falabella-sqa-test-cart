package co.falabella.com.tasks;

import co.falabella.com.interactions.GetNameProduct;
import co.falabella.com.utils.Excel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

import static co.falabella.com.ui.AddCartQuantityUI.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;


public class AddCartTask implements Task {

    private static ArrayList<Map<String, String>> data = new ArrayList<>();

    @Override
    public <T extends Actor> void performAs(T actor){
        try {
            data = Excel.leerDatosDeHojaDeExcel("src/test/resources/Data/DataCart.xlsx", "pageProductCart");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }



        actor.attemptsTo(
                WaitUntil.the(LBL_TITLE_PRODUCT_SELECTED, isVisible()).forNoMoreThan(10).seconds(),
                GetNameProduct.title(),
                Clear.field(TXT_QUANTITY),
                Enter.theValue(data.get(0).get("Amount")).into(TXT_QUANTITY),
                Scroll.to(TXT_QUANTITY).then(Click.on(BTN_CLICK_ADD)),
                Click.on(BTN_GO_TO_CART)
        );
    }

    public static Performable selectQuantityAndAddCart(){
        return instrumented(AddCartTask.class);
    }
}
