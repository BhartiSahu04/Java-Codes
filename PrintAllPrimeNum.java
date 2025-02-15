public class PrintAllPrimeNum {
      public static boolean isPrime(int n)   // main function for check prime or not
      {
            boolean isPrime = true;
            for(int i = 2; i<= n-1 ; i++)
            {
                  if(n%i == 0){
                        isPrime = false;     
                  }
                 
            }
            return isPrime;
      }
      public static void PrimeInRange(int n)   // helper Function for print  all Prime numbers
      {

            for(int i = 2; i<=n-1; i++){  // if true
                  if(isPrime(i))
                  {
                       System.out.print(i + " ");
                  }
            }
            System.out.println();
            
      }

      public static void main(String[] args) {
          PrimeInRange(100);   // function Calling With Range of n
      }
}