package Testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Parellel2 {
    @Test()
    public void amazonLauch(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\CODOID\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
    }
    @Test()
public void FlipKart(){
    System.setProperty("webdriver.gecko.driver", "C:\\Users\\CODOID\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");
    WebDriver driver = new FirefoxDriver();
    driver.get("https://www.flipkart.com/");
}


}
