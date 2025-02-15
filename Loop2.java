import java.util.*;
public class Loop2{
      public static void main(String args[]){
            Scanner var = new Scanner(System.in);
            System.out.println("Enter number");
            int n = var.nextInt();
            //sum of n numbers using for loop
            int sum =0;
            int i=0;
            /*for(int i=0; i<=n; i++){
                  sum = sum + i;
                 
            }
            System.out.println("sum of n numbers is");
            System.out.println(sum);*/
            while(i<=n){// sum of n numbers using while loop
                  sum=sum+i;
                  i++;
            }
            System.out.println(sum);
      }
}