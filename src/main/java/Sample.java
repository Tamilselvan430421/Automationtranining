import java.util.Scanner;

public class Sample {
    public static void main(String[] args) {
        System.out.println("welcome");
        Scanner scanner=new Scanner(System.in);
        int s=scanner.nextInt();
        int str=10;
        if (str==s){
            System.out.println("ok pass");
        }
        else {
            System.out.println("Not pass");
        }
    }
}
