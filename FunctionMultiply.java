import java.util.*;
public class FunctionMultiply{
      public static  int calculationsMultiply(int a, int b){

            return a*b;

      }

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter two numbers");
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println("Multiply of two numbers is :" +   calculationsMultiply(a,b) );


            
      }
}