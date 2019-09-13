package pagemodels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationPage extends HomePage {
    public WebDriver driver;

    private By emailInput = By.id("email");
    private By passwordInput = By.id("passwd");
    private By signInButton = By.id("SubmitLogin");

    private By pageTitle = By.id("page-heading");

    private static final String PAGE_URL="http://automationpractice.com/index.php?controller=authentication&back=my-account";

    public AuthenticationPage(WebDriver driver) {
        super(driver);
    }

    public void openSignInPage() {
        driver = new ChromeDriver();
        driver.get(PAGE_URL);
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

    public void getPageTitle(){
        driver.findElement(pageTitle);
    }

}
