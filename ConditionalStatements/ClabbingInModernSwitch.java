import java.util.Scanner;
//package Basics.src.ConditionalStatements;

public class ClabbingInModernSwitch {
    public static void main(String [] args){

        int number ;
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter your number:");
        number = kb.nextInt();
        switch(number){
            case 11,12,1,2-> System.out.println("Winter Season");
            case 7,6,5,34-> System.out.println("Rainy Season");
            case 4,3,9,10-> System.out.println("Summer Season");
            case 13,14,15,20-> System.out.println("I like the Season");
            default-> System.out.println("It is Wrong Input Please try another input");

        }

    }
}
