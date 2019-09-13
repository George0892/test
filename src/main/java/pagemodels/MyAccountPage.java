package pagemodels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyAccountPage extends HomePage {

    private static final String PAGE_URL="http://automationpractice.com/index.php?controller=my-account";
    private By myPersonalInformationButton = By.xpath("//*[@id=\"center_column\"]/div/div[1]/ul/li[4]/a/span" +
            "private static final String PAGE_URL=\"http://automationpractice.com/index.php?controller=my-account\";");

    WebDriver driver;

    public MyAccountPage(WebDriver driver) {
        super(driver);
    }

    public void openMyAccountPage() {
        driver = new ChromeDriver();
        driver.get(PAGE_URL);
    }

    public void clickMyPersonalInformationButton() {
        driver.findElement(myPersonalInformationButton).click();
    }
}
