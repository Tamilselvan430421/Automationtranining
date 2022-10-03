import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Sample1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\CODOID\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.tnpsc.gov.in/");
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        //WebElement applyonline = driver.findElement(By.xpath("//a[text()='Hall Ticket Download']/ancestor::li/preceding-sibling::li//a[.='Apply Online']"));
        WebElement applyonline = wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//a[text()='Hall Ticket Download']/ancestor::li/preceding-sibling::li//a[.='Apply Online']"))));
        applyonline.click();
        String parentwindow = driver.getWindowHandle();
        driver.switchTo().alert().accept();
        driver.findElement(By.linkText("Notification")).click();
/*
        Set<String> window = driver.getWindowHandles();

        for (String window2 : window) {
            System.out.println("Window name : "+window2);
            if (!(parentwindow.equals(window))) {
                driver.switchTo().window(window2);
            }
        }*/
//        Object o = driver.getWindowHandles().toArray()[1];
        driver.switchTo().window(driver.getWindowHandles().toArray()[1].toString());
        //Declare and initialise a fluent wait
        FluentWait fluentWait = new FluentWait(driver);
//Specify the timout of the wait
        wait.withTimeout(Duration.ofSeconds(50));
//Sepcify polling time
        wait.pollingEvery(Duration.ofSeconds(5));
//Specify what exceptions to ignore
        wait.ignoring(NoSuchElementException.class);

//This is how we specify the condition to wait on.
//This is what we will explore more in this chapter
        wait.until(ExpectedConditions.alertIsPresent());


    }
}
