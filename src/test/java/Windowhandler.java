import org.dataloader.Try;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Windowhandler {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\CODOID\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.tnpsc.gov.in/");
        driver.manage().window().maximize();
        String parentwindow=driver.getWindowHandle();
        WebElement onlineclick1= driver.findElement(By.xpath("//a[text()='Hall Ticket Download']/ancestor::li/preceding-sibling::li//a[.='Apply Online']"));
        onlineclick1.click();
        Thread.sleep(5000);
        Thread.sleep(5000);
//Boolean verified=false;
//       int numofwindows=driver.getWindowHandles().size();
//        System.out.println(numofwindows);
//        for (String handles:windowHandles) {
//            driver.switchTo().window(handles);
//
//        }
        Thread.sleep(5000);
        try {
            driver.switchTo().alert().accept();
            Set<String> windowHandles=driver.getWindowHandles();
            List<String> windowHandlesList = new ArrayList<>(windowHandles);
//            System.out.println("Total window number: " + windowHandlesList.size() + "\n");
            driver.switchTo().window(windowHandlesList.get(1));
//            driver.switchTo().window(driver.getWindowHandles().toArray());
            Thread.sleep(5000);
            driver.findElement(By.xpath("//a[normalize-space()='CI Login']/child::div")).click();
            System.out.println("True");
            driver.quit();
        }
        catch (IndexOutOfBoundsException Ns){

//            System.out.println("false");


        }
        catch (Exception e){

            e.printStackTrace();
            System.out.println("Exception handle"+e.getMessage());
        }
finally {
            System.out.println("Exception handle");
        }



//        WebElement notification= driver.findElement(By.xpath("//a[text()='Hall Ticket Download']/ancestor::li/preceding-sibling::li//a[.='Notification']"));
//        notification.click();


    }


}
