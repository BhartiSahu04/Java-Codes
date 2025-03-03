package ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {
        try{
        int a,b;
        Scanner kb= new Scanner(System.in);
        System.out.print("Enter first integer : ");
        a=kb.nextInt();
        System.out.print("Enter Second integer : ");
        b= kb.nextInt();
            int c= a/b;
            System.out.println("Divide of number is : "+ c);
            int sum= a+b;
            System.out.println("Sum of Two integer is : "+sum);
        }
        catch(ArithmeticException ref){
            System.out.println("Bhai! Zero mat de ");
        }
        catch(InputMismatchException ref){
            System.out.println("Dono Number Integer de bro ");
        }
    }
}
