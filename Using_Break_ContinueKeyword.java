import java.util.*;
public class Using_Break_ContinueKeyword {

      public static void main(String[] args) {
            //Scanner sc = new Scanner(System.in);
            //System.out.println("Enter your number");

            //1. Break :- Break is a keyword which is used to break the execution of loop/scope.
              /*int i=0;
            while(i<=10){
                  i++;
                  System.out.println(i);
                  if(i==4){
                        break;
                  }
                 
            }
            System.out.println("Execution done by compiler.");*/
            

            

            /*2.Continue :- Continue is a keyword which is used to break the excecution only one particular 
            condition and it keep on  Excecuting its Block                                              */
            int i=0;
            while(i<=10){
                  i++;
                  System.out.println(i);
                  if(i==4)
                        continue;
                  
                 
            }
            System.out.println("Execution done by compiler.");

            
      }
}