import java.util.*;
public class BinomialCoefficient {
      //Function for Factorial
      public static  int  factorial(int num){
            int f = 1;
            for(int i = 1; i<=num; i++)
            {
                  f = f*i;
            }
            return f;
      }
      // Find Binomial coefficient [ n!/ r!(n-r)!]
       public static int BinoCoeffi(int num , int r)  // Helper Function
      {
            int n_Factorial= factorial(num);
            int r_Factorial= factorial(r);
            int n_r_Factorial= factorial(num-r);

            int bin_coff = n_Factorial/(r_Factorial*n_r_Factorial);
            return bin_coff;
      }
      // Main Function
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter Your Number Find the Factorial:- ");
            int num = sc.nextInt();
            System.out.print("Enter your r :- ");
            int r = sc.nextInt();
           System.out.println("Binomial coefficient is = " + BinoCoeffi(num, r)); // function Calling 

      }  
}