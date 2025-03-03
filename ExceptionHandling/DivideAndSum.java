package ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivideAndSum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a=0,b=0;
        try{
            System.out.print("Enter Your first  Integer");
             a=sc.nextInt();
            System.out.print("Enter Your Second Integer");
            b=sc.nextInt();
            int c= a/b;
            System.out.println("Divide is "+c);


        }
        catch(ArithmeticException ref){
            System.out.println("Denominator Should not be Zero");
        }
        catch(InputMismatchException ref){
            System.out.println("Both number should be Integers");
            System.exit(0);
        }
        int d= a+b;
        System.out.println("Sum is "+d);
    }
}
