import java.util.*;
public class FunctionSum{
      public static int calculationsSum(int a , int b)
      {
            int sum = a * b;
            return sum;
      }
public static void main(String args[])
{
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter number 1");
      int a = sc.nextInt();
      System.out.println("Enter num 2");
      int b = sc.nextInt();
      int sum = calculationsSum(a, b);
      System.out.println("sum of two numbers is = " + sum);
      
}
}