package co.falabella.com.questions;

import co.falabella.com.utils.Excel;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

import static co.falabella.com.ui.TitleAndQuantityArticleUI.LBL_QUANTITY_ARTICLES;

public class QuantityProductQuestion implements Question<Boolean> {

    private  static ArrayList<Map<String, String>> data= new ArrayList<>();
    @Override
    public Boolean answeredBy(Actor actor){

        try {
            data = Excel.leerDatosDeHojaDeExcel("src/test/resources/Data/DataCart.xlsx", "pageProductCart");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        WebElementFacade btnProductSelected = LBL_QUANTITY_ARTICLES.resolveFor(actor);
        String quantityArticles = btnProductSelected.getText();

        return (data.get(0).get("Amount")).equals(quantityArticles);

    }

    public static Question<Boolean> from(){
        return new QuantityProductQuestion();
    }
}
