package stepsdefinition;

import cucumber.api.java.en.And;
import org.openqa.selenium.WebDriver;
import pagemodels.MyAccountPage;

public class MyAccountPageStepDef {

    WebDriver driver;

    @And("^user clicks the My Personal Information button$")
    public void andTheUserClicksTheMyPersonalInformationButton(){
        MyAccountPage myAccountPage = new MyAccountPage(driver);
        myAccountPage.clickMyPersonalInformationButton();

    }
}
