package ExceptionHandling;

public class DescriptionOfException {
    public static void main(String[] args) {
        try{
         int a=9;
         int b= 7;
         int c= a/b;
            System.out.println("div is = "+c);
        }
        catch(Exception ref){
            Throwable ex;
            System.out.println("some exception !");
        }
    }
}
