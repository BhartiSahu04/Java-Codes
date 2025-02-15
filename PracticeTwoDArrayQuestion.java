 import java.util.*;
 public class PracticeTwoDArrayQuestion {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter no of row");
            int row = sc.nextInt();
            System.out.println("Enter no. of column");
            int column = sc.nextInt();
            // for input
            int [][] array = new int[row][column];
            for(int i = 0; i<row; i++)
            {
                  for(int j = 0; j<column ; j++){
                        array[i][j] = sc.nextInt();

                  }
            }
            // // taking no. to be searched
            // System.out.println("Enter your no. to be searched");
            // int x = sc.nextInt();

            // //for output
            // for(int i = 0; i<row; i++)
            // {
            //       for(int j = 0; j<column ; j++){
            //            if(array[i][j] == x){
            //             System.out.println(" Number Found in location(" + i +" ," +j + " )");
            //            }

            
                  }

            }




            
      }
      
}
