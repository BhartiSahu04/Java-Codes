import java.util.*;
public class string_method {

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your name:-");
            String name = sc.nextLine();

            // 1. String Method1:-
            // Name.length() = Function for finding the length of any string.
            //int value = name.length();      
            //System.out.println("Length of the name is :" + value);

            // 2. String Method2:-
            //name.toLowrCase() = function to convert the string into lowercase
             /*String  new_name = name.toLowerCase();
             System.out.println("String of lower case is " + new_name);*/

             // 3. String Method3:-
             //name.toUpperCase() = function to convert the string into uppercase.
             /*String  new_name = name.toUpperCase();
             System.out.println("String of upper case is=:-" + new_name);*/


             // 4. String Method4:-
             //name.trim() = function to remove all the spaces in given string.
             //String name = " Bharti Sahu How are you";
             //String  new_name = name.trim();
             // System.out.println(name.trim());


             // 5. String Method :-
             // name.substring() =
             //String name = "Bharti";
            // String new_name = name.substring(1);
             //System.out.println("New String is:- " + new_name);



              // 6. String Method :-
             // name.substring() =
             //String name = "Bharti";
             //String new_name = name.substring(1, 4);
             //System.out.println("New String is:- " + new_name);



              // 6. String Method :-
             // name.replace(char , char) =
             //String name = "Bharti";
             //String new_name = name.replace('r','p');
             //System.out.println("New String is:- " + new_name);


              // 7. String Method :-
             // name.startsWith("String") =
            // String name = "Bharti";
             //System.out.println(name.startsWith("Bh"));


              // 8. String Method :-
             // name.endsWith() = 
             //System.out.println(name.endsWith("ti"));

             // 9. String Method :-
             // name.charAt(index) = 
             //System.out.println(name.charAt(3));

             // 10. String Method :-
             // name.indexOf("char") = 
             //System.out.println(name.indexOf("ti"));
             // if there is no found match then simply print '-1'.

             // 6. String Method :-
             // name.endsWith() = 
             System.out.println(name.indexOf("bh",4));




      }
}