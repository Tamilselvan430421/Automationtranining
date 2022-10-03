import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Tnpsc {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\CODOID\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.tnpsc.gov.in/");
        driver.manage().window().maximize();
      List<WebElement> lstelements= driver.findElements(By.xpath("//li[@class='notice']"));
        System.out.println("Welcome"+lstelements.size());
    WebElement element1=lstelements.get(0);
        System.out.println("element1"+element1.getText());
//        for(int i=0; i<lstelements.size(); i++){
//          lstelements.get(i);
//
//        }
//        for (WebElement s:lstelements) {
//            s.getText();
//
//        }
        lstelements.forEach(elemt->elemt.getText());

    }
}
