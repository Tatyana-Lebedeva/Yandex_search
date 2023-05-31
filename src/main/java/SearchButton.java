import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class SearchButton {
    WebDriver driver;
    public SearchButton(WebDriver driver) {
        this.driver = driver;
    }


    // кнопка поиск
    private final By buttonSearch = By.xpath("//input[@placeholder='найдётся всё']");
    private final By fillSearchField = By.xpath("//button[@type='submit']");

    public void clickButtonSearch () {
        driver.findElement(buttonSearch).click();
    }
    public void enterFillSearchField (){
        driver.findElement(buttonSearch).sendKeys("слово");
    }

    public void sendKeysFillSearchField (){
        driver.findElement(fillSearchField).click();
    }
}
