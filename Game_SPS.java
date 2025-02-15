import java.util.*;
public class Game_SPS {

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your Choise !(rock / Paper / Scissors)");
            String given_no = sc.nextLine();
            Random num = new Random();
            //System.out.print("Enter random no. From Computer side ");
            int r_no = num.nextInt(3);
            String computerMove;
        if (r_no == 0) {
            computerMove = "rock";
        } else if (r_no == 1) {
            computerMove = "paper";
        } else {
            computerMove = "scissors";
        }
        System.out.println("Computer chose :-" + computerMove + "!");
            if(computerMove.equals(given_no)){   
                  // "1" stands for Stone.
                  // "2" Stands for Paper.
                  // "3" Stands for Scissor.
                System.out.println("Game tie Try one more time.");
            }
            else if (computerMove.equals("rock") && given_no.equals("paper")){
                  System.out.println("Congratulations! In this case Computer is Winner ");

            }
            else if (computerMove.equals("rock") && given_no.equals("scissors")){
                  System.out.println("Congratulation! In this case Computer is Winner ");

            }
            else if (computerMove.equals("paper") && given_no.equals("scissors"))
                  {
                  System.out.println("Congratulation! .In this case you are the Winner ");
                  }

            
            else if (computerMove.equals("paper") && given_no.equals("rock")){
                  System.out.println("Congratulations! In this case Computer  Winner ");

            }
            else if (computerMove.equals("scissors") && given_no.equals("rock")){
                  System.out.println("Congratulations !In this case you are  Winner ");

            }
            else if(computerMove.equals("scissors") && given_no.equals("paper"))
            {
                  System.out.println("Congratulations! Computer win");
            }
            else
            {
                  System.out.println("Invalid Choice");
            }

      }
}

