package pagemodels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyAccountPage {

    private WebDriver driver;
    private static final String PAGE_URL = "http://automationpractice.com/index.php?controller=my-account";
    private static final By myPersonalInformationButton = By.xpath("//*[@id=\"center_column\"]/div/div[1]/ul/li[4]/a/span" +
            "private static final String PAGE_URL=\"http://automationpractice.com/index.php?controller=my-account\";");

    public MyAccountPage(WebDriver driver) {
        this.driver = driver;
    }

    public void openMyAccountPage() {
        driver.navigate().to(PAGE_URL);
    }

    public void clickMyPersonalInformationButton() {
        driver.findElement(myPersonalInformationButton).click();
    }
}
