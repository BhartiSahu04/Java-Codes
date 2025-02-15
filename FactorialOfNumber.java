 import java.util.*;
public class FactorialOfNumber {
      public static  int  factorial(int num){
            int f = 1;
            for(int i = 1; i<=num; i++)
            {
                  f = f*i;
            }
            return f;

      }
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter Your Number Find the Factorial:-");
            int num = sc.nextInt();
           System.out.println("Factorial of number is =  " + factorial(num));
            
      }
}