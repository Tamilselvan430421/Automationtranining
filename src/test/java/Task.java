import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Task {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\CODOID\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //Url launch
        // search box
        // button click
        // codoid search
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.titleIs("google"));








//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//btn[@id='submit']")));
//        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//btn[@id='submit']")));
////        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//btn[@id='submit']")));
//        new WebDriverWait(driver,Duration.ofSeconds(20))
//                .until((ExpectedConditions.visibilityOfElementLocated(By.xpath("//btn[@id='submit']"))));

    }
}
