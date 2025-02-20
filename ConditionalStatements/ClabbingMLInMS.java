import java.sql.SQLOutput;
import java.util.Scanner;
//package Basics.src.ConditionalStatements;

public class ClabbingMLInMS {
    public static void main(String [] args)
    {
        int num ;
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter the number:");
        num = kb.nextInt();
        switch(num){
            case 11,12,1,2->{
                System.out.println("Its rainy season Guys");
                System.out.println("Rainy Season");
            }
            case 3,4,5,6->{
                System.out.println("Its Winter season Guys");
                System.out.println("Winter Season");
            }
            case 7,8,9,10->{
                System.out.println("Its Summer season Guys");
                System.out.println("Summer Season");
            }
            default -> {
                System.out.println("Wrong Input");
                System.out.println("Please try Other input");
            }
        }
    }
}
