import java.util.*;
public class Print_table{
      public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter number to print a table");
            int num = sc.nextInt();
            int i;
            for( i=10; i>=1; i--){
                  System.out.println(num + "*" + i + " =" + num*i );
            
            }
            
      }
}