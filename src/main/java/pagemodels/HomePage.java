package pagemodels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage{
    final WebDriver driver;

    private final static By login = By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a");
    private static final String PAGE_URL="http://automationpractice.com";

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void openHomePage() {
        driver.navigate().to(PAGE_URL);
    }

    public void clickSignUpButton() {
     driver.findElement(login).click();
    }

}
