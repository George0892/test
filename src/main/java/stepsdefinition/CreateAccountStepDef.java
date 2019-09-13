package stepsdefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pagemodels.HomePage;
import pagemodels.SetUp;

public class CreateAccountStepDef {

    WebDriver driver;

    private HomePage homePage;

   // private SetUp setUp;

    @When("^user opens the automationpractice website$")
    public void userOpensTheAutomationPracticeWebsite() {
        SetUp setUp = new SetUp();
        setUp.setUp();
        HomePage homepage = new HomePage(driver);

    }

    @And("^user clicks the Sign in button$")
    public void userClicksTheSignInButton() {
    HomePage homepage = new HomePage(driver);
    homepage.clickSignUp();

    }

    @And("^close$")
    public void closeApplication() {
        SetUp setUp = new SetUp();
        setUp.tearDown();
    }

}
