import java.util.Scanner;

public class maximum {

    public static void main(String []args){

        int a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number");
        a=sc.nextInt();
        System.out.println("enter second number");
        b=sc.nextInt();
        System.out.println("enter third number");
        c=sc.nextInt();
        if (a<b && a<c)
        {
            System.out.println("a is maximum");
        }
        else if(b<a && b<c)
        {
            System.out.println("b is maximum");
        }
        else
        {
            System.out.println("c is maximum");
        }

    }

    
}
