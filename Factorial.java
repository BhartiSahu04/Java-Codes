import java.util.*;
public class Factorial{
      public static void main(String args[]){
            Scanner var = new Scanner(System.in);
            System.out.println("Enter number to find the factorial");
            int num1 = var.nextInt();
            
            int f=1;                      
             // num1 = 5
            // 1*5 = 5 = f  num => 5-1 = 4       
            while(num1>=1)
            {
                  f = f*num1;
                  num1 = num1-1;
            }
            System.out.println("factorial of num is");
            System.out.println(f); 

            //for(i=1; i>=num1; i--)

            }
      } 
      
