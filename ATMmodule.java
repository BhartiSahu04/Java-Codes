import java.util.*;
public class ATMmodule {

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your pin :");
            int pin = sc.nextInt();
            int balance =10000;
            int  new_balance ;
            
            if(pin == 123){
                  System.out.println("Enter your ammount to be withdrow: ");
                  int witndrow = sc.nextInt();
                  new_balance = balance - witndrow;
                  System.out.println("you have  new Acc balanace is :" + new_balance);
            }
            else {
                  System.out.println("invalid pin");
            }

            

            }
      }
