import java.util.*;
public class switchCase2 {

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your age :");
            int age = sc.nextInt();
            switch(age){
                  case 7:
                       System.out.println("Not Adult");
                       break;
                  case 18:
                       System.out.println(" Adult");
                       break;
                  case 45:
                       System.out.println("Semi Senior ");
                       break; 
                  case 60:
                       System.out.println(" Senior");
                       break;

                  default:
                       System.out.println(" not match found");
                       break;

            }
      }
}