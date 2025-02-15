import java.util.*;
public class Using_ArrayFumctions {

      public static void main(String[] args) {
            //Scanner sc = new Scanner(System.in);
            int [] marks ={23 ,56 , 56, 89, 76 , 43};   
            
            // using length Function == to find the length of array.
            //System.out.println(marks.length);
            //System.out.println(marks[4]);

            // for displaying an array using a for loop!
            /*for( int i =0; i<=marks.length;i++)
            {
                  System.out.println(marks[i]);
            }*/

            // for-each loop
            for(int element : marks){
                  System.out.println(element);

            }
            

      }
}