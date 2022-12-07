package StepDefinitions;

import io.cucumber.java.en.Given;

public class BackgroundStepsDefinitions extends AbstractStepsDefinitions{
    @Given("the login-page is open")
    public void theloginpageIsOpen() {
        loginPage.openPage();
    }
}
