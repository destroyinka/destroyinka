package selenium;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CalculateVersionTwo {

    @Test
    public void openQuickpricerHomePage() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/selenium/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();

        driver.navigate().to("https://pricer.admortgage.com");

        String expectedText = "Calculate";
        String actualText = "";

        actualText = driver.findElement(By.id("quickPricerCalculateBtn")).getText();
        if (actualText.contentEquals(expectedText)){
        System.out.println("Passed");
        } else {
        System.out.println("Failed");

        driver.quit();
        }
    }
}
