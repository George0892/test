package stepsdefinition;

import cucumber.api.java.en.And;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pagemodels.MyAddressesPage;

import java.util.concurrent.TimeUnit;

public class MyAddressesPageStepDef {

    private WebDriver driver;
    private MyAddressesPage myAddressesPage;

    @And("^user clicks the Update buótton$")
    public void theUserClicksTheUpdateButton() {
        myAddressesPage.clickTheUpdateButton();

    }

    @And("^user updates the First Name field to \"([^\"]*)\" and clicks Save$")
    public void theUserUpdatesTheFirstNameFieldTo(String firstName) {
        myAddressesPage.getfirstNameInput(firstName);
        myAddressesPage.clickTheSaveButton();
    }

    @And("^First name is updated in the My Addresses page$")
    public void firstNameIsUpdatedInTheMyAddressesPage() {

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
