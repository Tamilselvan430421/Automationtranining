import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class mycontactselect {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\CODOID\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.mycontactform.com/samples.php");
        WebElement ele=driver.findElement(By.id("q9"));
        Select se=new Select(ele);
        Thread.sleep(3000);
     se.selectByIndex(2);
     driver.findElements(By.xpath(""));
//        Thread.sleep(3000);
//        se.selectByValue("Andorra");
//        Thread.sleep(3000);
//        se.selectByVisibleText("Argentina");

    }
}
