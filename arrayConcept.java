public class arrayConcept {

      public static void main(String[] args) {
            // Array is a collection of Similar data types.
            //Initialization of Array
            // There are Following  three ways to initialise the array :

            // 1. 
            /*int array[] = new int[5];       // Declaration + Memory Allocation
            array[0] = 45;
            array[1] = 46;
            array[2] = 48;
            array[3] = 467;
            array[4] = 478;
            System.out.println(array[2]);*/

            // 2.
            /*int array[];                 //Declaration
            array =  new int[5];         // Memory Allocation
            array[0] = 45;
            array[1] = 46;
            array[2] = 48;
            array[3] = 467;
            array[4] = 478;
            System.out.println(array[2]);*/

            // 3.
            int array [] = {45,78,89,565,67,34,2};        // Declaretion + Initialise
            System.out.println(array[4]);
      }
}

     // Note :- Array index  always starts with 0 and goes till (n-1) where n is the size of array.