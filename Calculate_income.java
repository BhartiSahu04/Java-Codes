import java.util.*;
public class Calculate_income {

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your Income in lakh to calculate your tax :-");
            float income = sc.nextFloat();
            float tax = 0;
             if(income<=2.5f){
                  tax = tax + 0;
                  System.out.println("There is no tax.");
             }
             if(income>2.5f && income<=5.0f){
                  tax = tax + 0.05f * (income - 2.5f );
                  System.out.println("There is only 5% tax :-" + tax);
             }
             if(income>5.0f && income<=10.0f){
                  tax = tax + 0.05f * (income - 2.5f );
                  tax = tax + 0.2f * (income - 5.0f );
                  System.out.println("There is only 20%  tax taken :-" + tax);
             }
             if( income>10.0f){
                  tax = tax + 0.05f * (income - 2.5f );
                  tax = tax + 0.2f * (income - 5.0f );
                  tax = tax + 0.3f * (income - 10.0f );
                  System.out.println("There is only 30% tax taken:-20" + tax);
             }

      }
}