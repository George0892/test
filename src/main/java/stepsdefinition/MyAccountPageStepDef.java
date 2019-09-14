package stepsdefinition;

import cucumber.api.java.en.And;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pagemodels.MyAccountPage;

import java.util.concurrent.TimeUnit;

public class MyAccountPageStepDef {

    private WebDriver driver;
    private MyAccountPage myAccountPage;

    @And("^user clicks the My Personal Information button$")
    public void andTheUserClicksTheMyPersonalInformationButton(){
        myAccountPage = new MyAccountPage(getWebDriver());
        myAccountPage.clickMyPersonalInformationButton();
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
