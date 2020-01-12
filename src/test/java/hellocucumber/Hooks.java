package hellocucumber;

import com.codeborne.selenide.logevents.SelenideLogger;
import cucumber.api.java.Before;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.After;

import static com.codeborne.selenide.Selenide.clearBrowserCookies;
import static com.codeborne.selenide.WebDriverRunner.clearBrowserCache;

public class Hooks {
    @Before
    public void openBrowser(){
        clearBrowserCache();
        clearBrowserCookies();
    }

    @After
    public void closeBrowser(){
        closeBrowser();
    }
}
