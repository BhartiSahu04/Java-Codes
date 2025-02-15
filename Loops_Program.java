import java.util.*;
public class Loops_Program {

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your n:-");
            int n = sc.nextInt();


            //Question 1. Print Pattern
            /*for(int i=5; i>=1; i--)
            {
                  for(int j=1; j<=i; j++) {
                        System.out.print("*");
                  }
                  System.out.println();  
            }*/
      

      

           


            //Question 2. Print Table
            /*if(n>=0){
                  for(int i = 1; i<=10; i++){
                        System.out.println(n +"*"+ i +"=" + (n*i));

                  }
            }
            else{
                        System.out.println("number is negative");
                  }
            }*/


            //Question 3. sum of all n even numberes using while loop
            while(n/2==0){
                  int sum = 0;
                  sum = sum+n;
                  n++;

            }

            

      }
      }