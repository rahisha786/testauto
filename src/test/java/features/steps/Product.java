package features.steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import features.steps.serenity.BuyerSteps;
import net.thucydides.core.annotations.Steps;


public class Product extends SearchByKeywordDefinition {

    @Steps
    BuyerSteps buyer;

    @Then("I should see product description and price on the details page(.*)")
    public void seeDescriptionAndPrice() {
        buyer.see_description_and_price;
    }

    @When("I select Add to Cart for irem 1(.*)")
    public void selectAddToCart(){
        buyer.select_add_to_cart;
    }

    @Then("I should see it on my checkout page(.*)")
    public void seeCheckOutPage(){
        buyer.see_checkout_page;
    }
}



