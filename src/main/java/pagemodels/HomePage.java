package pagemodels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

    protected WebDriver driver;

    private By login = By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a");


    private static final String PAGE_URL="http://automationpractice.com";

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public HomePage openHomePage() {
        driver.get(PAGE_URL);
        return this;
    }

    public void clickSignUp() {
        driver.findElement(login).click();

    }

}
