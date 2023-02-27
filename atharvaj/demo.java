//Program for addition of two numbers
import java.util.Scanner;

public class demo{
    public static void main(String []args){
        
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        a=sc.nextInt();
        System.out.println("Enter second number");
        b=sc.nextInt();
        c=a+b;
        System.out.println("Addition is"+c);
    }
}