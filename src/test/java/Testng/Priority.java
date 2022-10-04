package Testng;

import org.testng.annotations.Test;

public class Priority {
    @Test(priority = 1)
    public void loginpage(){
        System.out.println("Login successfully");
    }
    @Test(priority = 3)
    public void hompage(){
        System.out.println("Hompage opened");
    }
    @Test(priority = 2)
    public void signout(){
        System.out.println("signout successfully");
    }
}
