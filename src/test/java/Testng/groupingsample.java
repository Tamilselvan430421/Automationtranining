package Testng;

import org.testng.annotations.Test;

public class groupingsample {
    @Test(groups ={"loginpage"})
    public void login(){
        System.out.println("login successful");
    }
    @Test(groups = {"loginpage"})
public void forgetpassword(){
    System.out.println("forget password option");
}
    @Test(groups = {"loginpage"})
public void singup(){
    System.out.println("Sigeup succcessfully");
}
    @Test(groups = {"Homepage"})
public void status(){
    System.out.println("status created");
}
    @Test(groups = {"Homepage"})
public void message(){
    System.out.println("message sent option");
}
}
