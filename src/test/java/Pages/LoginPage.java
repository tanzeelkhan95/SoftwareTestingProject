package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    private WebDriver driver;

    private static final String MainPage = "https://www.saucedemo.com/";
    public static final String NextUrl = "https://www.saucedemo.com/inventory.html";


    public static final By Username = By.id("user-name");

    public static final By Password = By.id("password");

    @FindBy(id = "login-button")
    private WebElement loginButton;

    @FindBy(xpath = "//h3")
    private WebElement loginErrorMessage;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void openPage() {
        driver.get(MainPage);
        PageFactory.initElements(driver, this);
    }

    public void fillField(By locator, String value) {
        getField(locator).sendKeys(value);
    }

    public WebElement getField(By locator) {

        return driver.findElement(locator);
    }

    public void clickLoginButton(){

        loginButton.click();
    }

    public String getLoginErrorMessage(){

        return loginErrorMessage.getText();
    }

}
