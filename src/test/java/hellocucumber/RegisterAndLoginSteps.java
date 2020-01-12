package hellocucumber;

import com.codeborne.selenide.SelenideElement;
import cucumber.api.java.en.Given;

import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.*;

public class RegisterAndLoginSteps {
    SelenideElement firstNameInput = $(byName("firstname"));

    @Given("I am in register page")
    public void iAmInRegisterPage() {
        open("https://www.phptravels.net/register");
        firstNameInput.sendKeys("hey there");

    }
}
