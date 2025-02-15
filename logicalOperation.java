import java.util.*;
public class logicalOperation {

      public static void main(String[] args) {
            boolean  a = false;
            boolean b = true;
            

             // Type 1:-
            // AND( && ) operator 
            // In this operator if any one is false the answer is always false.

            /*if(a && b){
                  System.out.println("yes");
            }
            else{
                  System.out.println("No");
            }*/



             // Type :- 2
            // OR( || ) operator
            // in this if only one is true the output will always true.


            /*if(a || b){
                  System.out.println("yes");
            }
            else{
                  System.out.println("No");
            }*/



            // Type :- 3
            // NOT( '!' ) OPERATOR
            // Not means Opposite i.e true to false and , false to true. example( 0 = 1 and 1 = 0).

            System.out.print("Not a is :-");
            System.out.println(!a);
            System.out.print("Not b is :-");
            System.out.println(!b);
      }
}