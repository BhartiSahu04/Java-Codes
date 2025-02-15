public class OperatorOverloading {


      public static int mymethod(int a, int b){
            int sum = a+b;
            return sum;
      }
      public static int mymethod(int a, int b,int c){
            int sum1 = a+b+c;
            return sum1;
      }
      public static int mymethod(int a, int b ,int c ,int d){
            int sum2 = a+b+c+d;
            return sum2;
      }
      
      public static void main(String[] args) {
            System.out.println(mymethod(25, 670));
            System.out.println(mymethod(25, 670 ,56));
            
            System.out.println(mymethod(25, 670 ,67,78));
            
            
      }
      
}



    