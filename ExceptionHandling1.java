package Exception_Handling;

import java.util.Scanner;

public class ExceptionHandling1 {
    public static void main(String[] args) {
        Scanner kb= new Scanner(System.in);
        int a,b;
        System.out.println("Enter Your  two Number:-");
        a=kb.nextInt();
        b= kb.nextInt();

//        Exception Handling Starts here

        try{
            int divide = a/b;
            System.out.println("Divide of Two Numbers is :-"+divide);

        }
        catch(ArithmeticException ref){
            System.out.println("Bhai , Zero Mat de Yaar");
        }

//        Exception Handling End here

        int sum=a+b;
        System.out.println("Sum of Two Numbers is:-"+sum);
    }
}
