import java.util.*;
public class Greatest_num {
      public static void main(String args[])
      {
      Scanner var= new Scanner (System.in);
      System.out.println("Enter 3 numbers");
      int a = var.nextInt();
      int b = var.nextInt();
      int c = var.nextInt();
      if(a>b && a>c)
      {
            System.out.println("a is greater");
      }
      else if(b>c){
            System.out.println("b is greater");
      }
      else{
            System.out.println("c is greater");
      }
      }
}