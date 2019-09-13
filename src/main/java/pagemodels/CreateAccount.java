package pagemodels;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAccount extends HomePage {
    public WebDriver driver;

    public CreateAccount(WebDriver driver) {
        super(driver);
    }

    public void setUp() {
        driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
    }


}
