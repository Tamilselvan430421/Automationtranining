import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class Facebook1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\CODOID\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/login/");

        PageFactory.initElements(driver,Loginpage.class);
        Loginpage.Email.sendKeys("username123@gmail.com");
        Loginpage.Password.sendKeys("Tamil1234");
        Loginpage.login.click();


    }
}
