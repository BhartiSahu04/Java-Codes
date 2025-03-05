package CreatingProgrammerDefinedException;

import java.util.Scanner;

public class CustomExceptionDemo {
    public static void main(String[] args) {
        Scanner kb= new Scanner(System.in);
        try{
            System.out.println("Enter 2 Integer:-");
            int a= kb.nextInt();
            int b= kb.nextInt();
            if(a<=0){
                InvalidNumeratorException ex = new InvalidNumeratorException("Numerator Should be Positive");
                throw ex;
            }
            int c=a/b;
            System.out.println("div is "+c);

        }
        catch(ArithmeticException obj){
            System.out.println(obj);
        }
        catch(InvalidNumeratorException ex){
            System.out.println(ex);
        }
        finally{
            System.out.println("Have a good Day");
        }
    }

}




