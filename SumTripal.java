import java.util.*;
public class SumTripal {

      public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter Tripple digit number");
      int n = sc.nextInt();
      int rm; 
      int s;
      s = 0;
      rm = n%10;
      s = s+rm;
      n = n/10;
      rm = n%10;
      s = s+rm;
      n = n/10;
      rm = n%10;
      s = s+rm;
      n = n/10;
      System.out.println("Sum of each digit of number is " + s);



      }
}