package features.pageObjects;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

@DefaultUrl(value = "http://store.demoqa.com/")
public class HomePage {

    @FindBy(css = "nav form fieldset input.search")
    public WebElement searchField;
    WebDriver driver;

    public void searchFor(String keywords) {
        searchField.sendKeys(keywords);
        searchField.sendKeys(Keys.ENTER);
    }

    public void open() {
        driver.get("http://store.demoqa.com/");
        WebDriverWait wait;
        wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("logo")));
    }
}