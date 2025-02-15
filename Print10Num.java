import java.util.*;
public class Print10Num {

      public static void main(String[] args) {
            
            int i = 1;
            while(i<=10){
                  Scanner sc = new Scanner(System.in);
                   System.out.println("Enter number : ");
                   int n = sc.nextInt();
                  
                   i  = i+1;
                   System.out.println("number is:" + n);
            }      
      }
}