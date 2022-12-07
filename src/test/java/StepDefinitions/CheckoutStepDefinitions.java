package StepDefinitions;

import Pages.ProductPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.*;

public class CheckoutStepDefinitions extends AbstractStepsDefinitions {
    @Given("User clicks on Checkout button")
    public void checkoutButtonClicked() {
        productPage.clickCheckoutButton();
    }

    @And("User enters their first name: {string}")
    public void enterFirstName(String firstName) {
        productPage.fillField(ProductPage.FirstName,firstName);
    }

    @And("User enters their last name: {string}")
    public void enterLastName(String lastName) {
        productPage.fillField(ProductPage.LastName,lastName);
    }
    @And("User enter their zip code: {string}")
    public void enterZipCode(String postCode) {
        productPage.fillField(ProductPage.PostalCode,postCode);
    }

    @When("User clicks on Continue button")
    public void continueButtonClicked() {
        productPage.clickContinueButton();
    }

    @Then("The user is directed to the next checkout page")
    public void NextCheckoutPage() {
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.saucedemo.com/checkout-step-two.html");
    }

    @Then("User is prompted with the message: {string}")
    public void UserCheckoutMessage(String message) {
        Assert.assertEquals(message,productPage.getInformationErrorMessage());
    }
}
