package features.steps.serenity;


import features.pageObjects.HomePage;
import features.pageObjects.SearchResultsPage;
import net.thucydides.core.annotations.Step;


public class BuyerSteps {

    HomePage homePage;
    SearchResultsPage searchResultsPage;

    @Step
    public void opens_home_page() {

        homePage.open();
    }

    @Step
    public void searches_for_items_containing(String keywords) {

        homePage.searchFor(keywords);
    }

    @Step
    public boolean should_see_items_related_to(String keywords) {
        return searchResultsPage.checkResult(keywords);
    }

    @Step
    public void see_description_and_price() {
        searchResultsPage.checkDescriptionAndPrice();
    }

    @Step
    public void select_add_to_cart(){
        searchResultsPage.select_add_to_cart();
    }

    @Step
    public void see_checkout_page(){
        searchResultsPage.see_checkout_page();
    }
}
