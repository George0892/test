package stepsdefinition;

import cucumber.api.java.en.And;
import org.openqa.selenium.WebDriver;
import pagemodels.MyAddressesPage;

public class MyAddressesPageStepDef {

    WebDriver driver;

    @And("^user clicks the Update button$")
    public void theUserClicksTheUpdateButton() {
        MyAddressesPage myAddressesPage = new MyAddressesPage(driver);
        myAddressesPage.clickTheUpdateButton();

    }

    @And("^user updates the First Name field to \"([^\"]*)\" and clicks Save$")
    public void theUserUpdatesTheFirstNameFieldTo(String firstName) {
        MyAddressesPage myAddressesPage = new MyAddressesPage(driver);
        myAddressesPage.getfirstNameInput(firstName);
        myAddressesPage.clickTheSaveButton();
    }

    @And("^First name is updated in the My Addresses page$")
    public void firstNameIsUpdatedInTheMyAddressesPage() {

    }

}
