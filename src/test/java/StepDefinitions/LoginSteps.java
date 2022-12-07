package StepDefinitions;

import Pages.*;
import io.cucumber.java.en.*;
import org.junit.Assert;

public class LoginSteps extends AbstractStepsDefinitions{
    @Given("the user fills the username with {string}")
    public void Username(String userName) {
        loginPage.fillField(LoginPage.Username,userName);
    }

    @And("the user fills the password with {string}")
    public void Password(String password) {
        loginPage.fillField(LoginPage.Password,password);
    }

    @When("the user clicks the login button")
    public void ClickedonLoginbutton() {

        loginPage.clickLoginButton();
        productPage.initializeProductPage();
    }


    @Then("incorrect message shown")
    public void IncorrectMessage() {
        Assert.assertEquals(loginPage.getLoginErrorMessage(),"Epic sadface: Username and password do not match any user in this service");
    }

    @Then("the user is directed to the product page")
    public void theProductPageIsOpened() {
        Assert.assertEquals(driver.getCurrentUrl(), LoginPage.NextUrl);
    }

    @Then("the following message: {string} is seen")
    public void InvalidMessage(String message) {
        Assert.assertEquals(loginPage.getLoginErrorMessage(),message);
    }
}
