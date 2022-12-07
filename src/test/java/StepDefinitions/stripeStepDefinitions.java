package StepDefinitions;

import Pages.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class stripeStepDefinitions extends AbstractStepsDefinitions{

    @Given("the product page is opened")
    public void productPage() {
        Assert.assertEquals(driver.getCurrentUrl(), ProductPage.ProductPageURL);
    }

    @And("the user clicks on 3 stripe icon")
    public void clickonStripeIcon() {
        productPage.clickOnStripeButton();
    }

    @When("the user clicks on ABOUT category")
    public void clickonAboutcategory() {
        productPage.AboutClick();
    }

    @Then("The user is directed to ABOUT webpage")
    public void aboutPage() {
        Assert.assertEquals(driver.getCurrentUrl(),"https://saucelabs.com/");
    }

    @Given("the cart page is opened")
    public void theCartIsOpened() {
        productPage.CartClick();
    }

    @When("the user clicks on ALL ITEMS category")
    public void clickonAllItemsCategory() {
        productPage.AllItemClick();
    }

    @When("Logout category is clicked")
    public void logoutCategoryIsClicked() {
        productPage.LogoutClick();
    }

    @Then("The user login screen is open")
    public void theLoginScreenIsOpen() {
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.saucedemo.com/");
    }

    @Given("first item is added to cart")
    public void firstItem() {
        productPage.FirstAddtoCartButton();
    }

    @And("the cart item is there")
    public void theCartItemIsThere() {
        Assert.assertTrue(productPage.checkIfIconNumbrtExistsOnCart());
    }

    @When("Reset App State Categoty is Clicked")
    public void resetAppStateCategory() {
        productPage.ResetApp();
    }

    @Then("the cart item is not there")
    public void theCartItemIsNotThere() {
        Assert.assertFalse(productPage.checkIfIconNumbrtExistsOnCart());
    }
}
