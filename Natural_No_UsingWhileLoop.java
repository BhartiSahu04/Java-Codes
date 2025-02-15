import java.util.*;
public class Natural_No_UsingWhileLoop {

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your i:-");
            int i = sc.nextInt();
            System.out.println("Enter your n:-");
            int n = sc.nextInt();
            //while(i<=200){
              //    System.out.println(i);
                //  i++;
            //}
            do {
                  System.out.println(i);
                  i++;
            }while(i<=n);

            
      }
}