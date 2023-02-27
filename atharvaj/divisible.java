import java.util.Scanner;

public class divisible 
{
    
    public static void main(String[]args)
    {
        int a;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a number");
    a=sc.nextInt();
    if(a%5==0 && a%11==0)
    {
        System.out.println("it is divisible by 5 and 11");
    }
    else
    {
        System.out.println("it is not divisible by any number");

    }

    
    }
}
