import jdk.jfr.Description;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class SearchButtonTest extends BaseTest {

    SearchButton searchButton= new SearchButton(getDriver());

@Before
public void openPage() {
    openUrl();
}

@Test
@Description("Проверка поля поиск")
public void clickButtonSearch (){
    searchButton.clickButtonSearch();
}

@Test
@Description("Проверка кнопки найти")
public void sendKeysFillSearchField(){
    searchButton.enterFillSearchField();
    searchButton.sendKeysFillSearchField();
}


@After
     public void quitDriver() {
            baseAfter(getDriver());
        }

     }

