package pagemodels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AuthenticationPage {

    private final WebDriver driver;

    private final static By emailInput = By.id("email");
    private final static By passwordInput = By.id("passwd");
    private final static By signInButton = By.id("SubmitLogin");

    private By pageTitle = By.xpath("/html/head/title");

    private static final String PAGE_URL = "http://automationpractice.com/index.php?controller=authentication&back=my-account";

    public AuthenticationPage(WebDriver driver) {
        this.driver = driver;
    }

    public void openSignInPage() {
        driver.navigate().to(PAGE_URL);
    }

    public void getEmailInput(String email) {
        driver.findElement(emailInput).sendKeys(email);
    }

    public void getPasswordInput(String password) {
        driver.findElement(passwordInput).sendKeys(password);
    }

    public void clickTheSignInButton() {
        driver.findElement(signInButton).click();
    }

    public void getPageTitle() {
        WebElement element = driver.findElement(pageTitle);
        element.getLocation();
    }

}
