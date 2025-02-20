import java.util.Scanner;
//package Basics.src.ConditionalStatements;
public class CheckSeason {
    public static void main(String [] args){
        int number;
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter Your Number to Check the Season name:");
        number = kb.nextInt();
        switch(number){
            case 11 : case 12: case 1: case 2:
                System.out.println("Its winter season");
                break;
            case 3: case 4: case 5: case 6:
                System.out.println("its Summer season");
                break;
            case 7: case 8: case 9: case 10:
                System.out.println("Its Rainy Season");
                break;
            default:
                System.out.println("wrong input");
        }
    }
}
