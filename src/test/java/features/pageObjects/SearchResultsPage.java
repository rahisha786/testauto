package features.pageObjects;


import net.serenitybdd.core.annotations.findby.By;
import org.openqa.selenium.WebDriver;


public class SearchResultsPage {

    WebDriver driver;

    public String getResultTitles() {

        String results =  driver.findElement(By.cssSelector("h2")).getText();
        return results;
    }

    public boolean checkResult(String Keyword){

        String keyword = null;
        boolean searchResult = getResultTitles().contains(keyword);
        return searchResult;
    }
    
    public String checkDescriptionAndPrice(){
        String results =  driver.findElement(By.cssSelector(".currentprice")).getCssValue("Price");
        return results;
    }

    public void select_add_to_cart(){
        driver.findElement(By.cssSelector(".wpsc_buy_button")).click();
        driver.findElement(By.cssSelector(".go_to_checkout")).click();
    }

    public boolean see_checkout_page(){

        String checkoutPage = driver.findElement(By.cssSelector(".page-header")).getText();
        Boolean checkoutPageExists = checkoutPage.contains("Checkout");
        return checkoutPageExists;
    }

}
