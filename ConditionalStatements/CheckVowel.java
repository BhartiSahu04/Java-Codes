import java.util.Scanner;
//package Basics.src.ConditionalStatements;

import java.sql.SQLOutput;

public class CheckVowel {
    public static void main(String [] args){
        char Alphabet;
       Scanner kb = new Scanner(System.in);
        System.out.println("Enter yor character to check vowel or not:");
       Alphabet = kb.next().charAt(0);
       switch(Alphabet){
           case 'a', 'e','i','o','u'->{
               System.out.println("It is vowel");
           }
           case 'A', 'E','I','O','U'->{
               System.out.println("It is also vowel");
           }
           default -> System.out.println(" I is not Vowel ");
       }
        
    }
}
