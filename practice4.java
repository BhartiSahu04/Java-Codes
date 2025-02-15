import java.util.*;
public class practice4 {

      public static void main(String[] args) {
            /*int a = 10;
            if(a == 22){
                  System.out.println(" i am 11");
            }
            else{
                  System.out.println("i am not 22");
            }*/

            // Question no :- 2


            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your marks :-");
            int Physics = sc.nextInt();
            int Maths = sc.nextInt();
            int Chemistry = sc.nextInt();

            int total =(Physics+ Maths+Chemistry);
            float percentage = total/3.0f;
            System.out.println(percentage);
            if(percentage >= 40 && Physics<=33 && Maths<=33 && Chemistry<=33  ){
                  System.out.println("Congratulations, you have been promoted");
            }
            else if (percentage>= 60){
                  System.out.println(" Congratulations , you are pass in distinct");
            }
            else{
                  System.out.println("Sorry, you have not been promoted please try again");
            }




      


      }
}