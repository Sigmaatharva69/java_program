import java.util.Scanner;

public class hint {
   
    public static void main(String[]args)
    {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        a=sc.nextInt();
        if(a<0 && a>0)
        {
            System.out.println("a is positive");
        } 
        else
        {
            System.out.println("a is negative");
        }
    }
}
