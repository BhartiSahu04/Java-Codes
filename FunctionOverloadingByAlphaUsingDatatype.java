//  Function Overloading Using Data Types
public class FunctionOverloadingByAlphaUsingDatatype {
      // Function1 with two integer parameters

      public static int sum( int a, int b){
            return a+b;
      }
      // Function2 with two float parameters

      public static float sum( float a, float b ){
            return a+b;
      }

      // main Function
   public static void main(String[] args) {
      // Function Calling 
      System.out.println(sum(8, 8)); // F1
      System.out.println(sum( 6.7f, 7.8f)); //F2
      
   }   
}