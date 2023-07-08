package co.falabella.com.questions;

import co.falabella.com.interactions.GetNameProduct;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.falabella.com.ui.TitleAndQuantityArticleUI.LBL_TITLE_VALIDATE_CART;


public class NameProductQuestion implements Question<Boolean> {


    @Override
    public Boolean answeredBy(Actor actor){

        String titleNameProductSelected = GetNameProduct.getNameProductSelected(actor);

        return titleNameProductSelected.equals(LBL_TITLE_VALIDATE_CART.resolveFor(actor).getText());
    }

    public static NameProductQuestion from(){
        return new NameProductQuestion();
    }
}


