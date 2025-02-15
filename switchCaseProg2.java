import java.util.*;
public class switchCaseProg2 {
      // Question 3:
      /*Write a program to read a gender(M/F) and print the corresponding gender using switch Statement */

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter your character :");
            char char1 = sc.next().charAt(0);

            switch(char1){
                  case 'f':
                  case 'F':
                       System.out.println(" Gender is Female");
                       break;
                  case 'm':
                  case 'M':
                       System.out.println(" Gender is Male ");
                       break;
                  default :
                        System.out.println("Unspecified Gender");

            }


      }
}