package ExceptionHandling;

import java.util.Scanner;

public class ThrowKeyWord {
    public static void main(String[] args) {
        Scanner kb= new Scanner(System.in);
        try{
            System.out.println("Enter your numbers:-");
            int a = kb.nextInt();
            int b= kb.nextInt();
            if(a<=0){
                throw new ArithmeticException("Number Shows Be Positive");
            }
            int c=a/b;
            System.out.println("div is = "+ c);
        }
        catch(ArithmeticException obj){
            System.out.println(obj.getMessage());
        }
    }
}
