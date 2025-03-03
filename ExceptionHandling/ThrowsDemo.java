package ExceptionHandling;

import java.io.IOException;
import java.util.Scanner;

public class ThrowsDemo {
    public void acceptInt(){
        Scanner kb= new Scanner(System.in);
        System.out.println("Enter your Integer: ");
        int num= kb.nextInt();
        System.out.println("Your number is "+num);

    }
    public void  acceptChar() throws Exception{
        char ch;
        System.out.println("Enter Character:-");
        ch=(char)System.in.read();
        System.out.println("Your input is:- "+ch);
    }
}
class UseThrowsDemo{
    public static void main(String[] args) throws Exception {
        ThrowsDemo obj= new ThrowsDemo();
        obj.acceptInt();
        obj.acceptChar();
        System.out.println("Have a good Day");

    }
}
