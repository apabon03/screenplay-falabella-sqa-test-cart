package co.falabella.com.stepDefinitions;

import co.falabella.com.questions.NameProductQuestion;
import co.falabella.com.questions.QuantityProductQuestion;
import co.falabella.com.tasks.AddCartTask;
import co.falabella.com.tasks.HomeTask;
import co.falabella.com.tasks.ProductListTask;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class ProductCartStepDefinitions {

    @Before
    public void setStage() {
        setTheStage(new OnlineCast());
    }


    @Given("the user open page Falabella and search any product")
    public void theUserOpenPageFalabellaAndSearchAnyProduct() {
        theActorCalled("User").wasAbleTo(
                HomeTask.fromHome()
        );

    }
    @When("the system select one random product and user add three to cart")
    public void theSystemSelectOneRandomProductAndUserAddThreeToCart() {

        theActorInTheSpotlight().attemptsTo(
                ProductListTask.onProduct(),

                AddCartTask.selectQuantityAndAddCart()

        );

    }
    @Then("the user can read the quantity of products and the title he chose")
    public void theUserCanReadTheQuantityOfProductsAndTheTitleHeChose() {
        theActorInTheSpotlight().should(
                seeThat(
                        QuantityProductQuestion.from(), Matchers.is(true)
                ),
                seeThat(
                        NameProductQuestion.from(), Matchers.is(true)
                )
        );
    }
}
