package pagemodels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class SetUp {
    public WebDriver driver;

    private By blueButton = By.className("button");

    @Test
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("http://automationpractice.com");
    }



    @AfterClass
    public void tearDown() {
        driver.quit();
    }

}