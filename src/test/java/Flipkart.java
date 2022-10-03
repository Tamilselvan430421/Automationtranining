import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\CODOID\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();
        WebElement ele=driver.findElement(By.xpath("//a[text()='Login']"));
        Actions act=new Actions(driver);
        Thread.sleep(3000);
        act.moveToElement(ele).build().perform();
        WebElement ele2=driver.findElement(By.xpath("//div[text()='More']"));
        Thread.sleep(3000);
        act.moveToElement(ele2).build().perform();

    }
}
