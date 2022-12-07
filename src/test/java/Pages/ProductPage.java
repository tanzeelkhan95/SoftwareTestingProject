package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.*;
import java.util.Collections;
import java.util.List;

public class ProductPage {


    public static final String ProductPageURL = "https://www.saucedemo.com/inventory.html";

    private WebDriver driver;

    public static final By FirstName = By.id("first-name");
    public static final By LastName = By.id("last-name");
    public static final By PostalCode = By.id("postal-code");

    @FindBy(xpath = "//*[@id='react-burger-menu-btn']")
    private WebElement StripeButton;

    @FindBy(xpath = "//*[@id='inventory_sidebar_link']")
    private WebElement allItemClick;

    @FindBy(xpath = "//*[@id='about_sidebar_link']")
    private WebElement aboutClick;

    @FindBy(xpath = "//*[@id='logout_sidebar_link']")
    private WebElement logoutClick;

    @FindBy(xpath = "//*[@id='reset_sidebar_link']")
    private WebElement resetApp;

    @FindBy(className = "shopping_cart_link")
    private WebElement cart;

    @FindBy(xpath = "//*[@id=\"checkout_info_container\"]/div/form/div[1]/div[4]/h3")
    private WebElement informationErrorMessage;

    @FindBy(xpath = "//*[@id='checkout']")
    private WebElement checkoutButton;

    @FindBy(xpath = "//*[@id='continue']")
    private WebElement continueButton;

    @FindBy(xpath = "//*[@id='add-to-cart-sauce-labs-backpack']")
    private WebElement firstAddToCartButton;

    public void fillField(By locator, String value) {
        getField(locator).sendKeys(value);
    }

    public WebElement getField(By locator) {
        return driver.findElement(locator);
    }

    public void clickCheckoutButton(){
        checkoutButton.click();
    }
    public void clickContinueButton(){

        continueButton.click();
    }

    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }
    public String getInformationErrorMessage(){

        return informationErrorMessage.getAttribute("innerText");
    }

    public void initializeProductPage(){

        PageFactory.initElements(driver, this);
    }

    public void CartClick() {
        cart.click();
    }

    public void clickOnStripeButton() {
        StripeButton.click();
    }

    public void AllItemClick() {
        allItemClick.click();
    }

    public void AboutClick() {
        aboutClick.click();
    }

    public void LogoutClick() {
        logoutClick.click();
    }

    public void ResetApp() {
        resetApp.click();
    }

    public void FirstAddtoCartButton() {
        firstAddToCartButton.click();
    }


    public boolean checkIfIconNumbrtExistsOnCart() {
        List<WebElement> elements = driver.findElements(By.cssSelector("div.page_wrapper div.header_container:nth-child(1) div.primary_header div.shopping_cart_container:nth-child(3) a.shopping_cart_link > span.shopping_cart_badge"));
        if (elements.isEmpty()) {
            return false;
        } else {
            return true;
        }
    }


}

