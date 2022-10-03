import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Radiobutton {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\CODOID\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.mycontactform.com/samples.php");
      List<WebElement> lselements=driver.findElements(By.id("q9"));

        for(int i=0; i<lselements.size(); i++) {
            WebElement lsCountry=lselements.get(i);
           String scoutry=lsCountry.getText();
           String strCountry="Australia";

//            System.out.println(scoutry);

            System.out.println("Find the country in Australia");
            Pattern p = Pattern.compile("Australia");//. represents single character
            Matcher m = p.matcher(scoutry);

                while (m.find()){
                    System.out.println(m.group());
            }

//
//            if (scoutry==strCountry) {
//                System.out.println(scoutry);
//            } else {
//                System.out.println("No country");
//            }

        }
}
        }



