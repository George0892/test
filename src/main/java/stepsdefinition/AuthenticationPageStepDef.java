package stepsdefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import pagemodels.AuthenticationPage;
import pagemodels.HomePage;


public class AuthenticationPageStepDef {

    WebDriver driver;

    // private SetUp setUp;

    @When("^user opens the automationpractice website and clicks the Sign in button$")
    public void theUserOpensTheAutomationPracticeWebsite() {
        HomePage homePage = new HomePage(driver);
        homePage.openHomePage();
        homePage.clickSignUpButton();
    }

    @When("^user opens the automationpractice website and selects \"([^\"]*)\" category$")
    public void theUserOpensTheAutomationPracticeWebsiteAndSelectCategory() {
        HomePage homePage = new HomePage(driver);
        homePage.openHomePage();
        homePage.clickSignUpButton();
    }

    @And("^user inserts \"([^\"]*)\" and \"([^\"]*)\" and clicks the Sign in button$")
    public void theUserInsertsEmailAndPasswordAndClickTheSignInButton(String email, String password) {
        AuthenticationPage authenticationPage = new AuthenticationPage(driver);
        authenticationPage.openSignInPage();
        authenticationPage.getEmailInput(email);
        authenticationPage.getPasswordInput(password);
        authenticationPage.clickTheSignInButton();
    }

    @Then("the Authentication page is displayed$")
     public void theAuthenticationPageIsDisplayed(){
        AuthenticationPage authenticationPage = new AuthenticationPage(driver);
        authenticationPage.getPageTitle();
    }
}
