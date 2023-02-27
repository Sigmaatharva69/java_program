import java.util.Scanner;

public class calculate 

{
    
    public static void main(String[]args)
    {
        double l,b,area,perimeter;
        Scanner sc = new Scanner (System.in);
        System.out.println("enter l and b");
        l=sc.nextDouble();
        b=sc.nextDouble();
        area=l*b;
        System.out.println("second condition");
        perimeter=2*(l+b);
        System.out.println("calculate area" + area);
        System.out.println("calculate para" + perimeter);

    }
    
}
