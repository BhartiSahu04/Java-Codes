import java.util.*;

//  Function Overloading Using Parameters
public class FunctionOverloadingByAlpha {
      // Function1 with two parameters

      public static int sum( int a, int b){
            return a+b;
      }
      // Function2 with three parameters

      public static int sum( int a, int b ,int c){
            return a+b+c;
      }
      // Function3 with Four  parameters

      public static int sum( int a, int b, int c , int d){
            return a+b+c+d;
      }
      // main Function
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      // Taking inputs from User
      System.out.print(" Enter your First num 1 :- ");
      int a = sc.nextInt();
      System.out.print(" Enter your First num 2 :- ");
      int b = sc.nextInt();
      System.out.print(" Enter your First num 3 :- ");
      int c = sc.nextInt();
      System.out.print(" Enter your First num 4 :- ");
      int d = sc.nextInt();

      // Function Calling 
      System.out.println(sum(a, b)); // F1
      System.out.println(sum( a,b,c)); //F2
      System.out.println(sum(a,b,c,d)); //F3
   }   
}