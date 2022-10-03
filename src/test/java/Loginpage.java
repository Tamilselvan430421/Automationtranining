import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Loginpage {

    @FindBy(how= How.ID,using ="email")
    public static WebElement Email;
    @FindBy(id = "pass")
    public static WebElement Password;
    @FindBy(name="login")
    public static WebElement login;




}
