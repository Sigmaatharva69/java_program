//program for taking two digit number from user and printing its addition 
import java.util.Scanner;

public class remo{

    public static void main(String[]args){

        int a,b,c;
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter 2 digit number");
        a=sc.nextInt();
        b=a/10;
        c=a%10;
        a=b+c;
        System.out.println(a);

    }
}
    

