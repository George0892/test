package pagemodels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyAddressesPage extends HomePage {

    private static final String PAGE_URL = "http://automationpractice.com/index.php?controller=addresses";
    private static final By updateButton = By.xpath("//*[@id=\"center_column\"]/div[1]/div/div/ul/li[9]/a[1]");
    private static final By submitAddress = By.xpath("//*[@id=\"center_column\"]/div[1]/div/div/ul/li[9]/a[1]");
    private static final By firstNameInput = By.id("firstname");
    private static final By addressName = By.xpath("//*[@id=\"center_column\"]/div[1]/div/div/ul/li[2]/span[1]");

    public MyAddressesPage(WebDriver driver) {
        super(driver);
    }

    public void clickTheUpdateButton() {
        driver.findElement(updateButton).click();
    }

    public void clickTheSaveButton() {
        driver.findElement(submitAddress).click();
    }

    public void getfirstNameInput(String firstName) {
        driver.findElement(firstNameInput).sendKeys(firstName);
    }

}
