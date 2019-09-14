package stepsdefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pagemodels.AuthenticationPage;
import pagemodels.HomePage;

import java.util.concurrent.TimeUnit;

public class AuthenticationPageStepDef {

    private HomePage homePage;
    private AuthenticationPage authenticationPage;
    private WebDriver driver;

    // private SetUp setUp;

    @When("^user opens the automationpractice website and clicks the Sign in button$")
    public void theUserOpensTheAutomationPracticeWebsite() {
        homePage = new HomePage(getWebDriver());
        homePage.openHomePage();
        homePage.clickSignUpButton();
    }

    @When("^user opens the automationpractice website and selects \"([^\"]*)\" category$")
    public void theUserOpensTheAutomationPracticeWebsiteAndSelectCategory() {
        homePage.clickSignUpButton();
    }

    @And("^user inserts \"([^\"]*)\" and \"([^\"]*)\" and clicks the Sign in button$")
    public void theUserInsertsEmailAndPasswordAndClickTheSignInButton(String email, String password) {
        authenticationPage = new AuthenticationPage(getWebDriver());
        authenticationPage.openSignInPage();
        authenticationPage.getEmailInput(email);
        authenticationPage.getPasswordInput(password);
        authenticationPage.clickTheSignInButton();
    }

    @Then("the Authentication page is displayed$")
    public void theAuthenticationPageIsDisplayed() {
        authenticationPage = new AuthenticationPage(getWebDriver());
        authenticationPage.getPageTitle();
    }

    private WebDriver getWebDriver() {
        if (driver == null) {
            System.setProperty("webdriver.chrome.driver", "C:\\dev\\selenium\\binaries\\windows\\googlechrome\\64bit\\chromedriver.exe");
            ChromeDriver chromeDriver = new ChromeDriver();
            chromeDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver = chromeDriver;
            return chromeDriver;
        }
        return driver;
    }
}
