 import java.util.*;
 public class AddMatrix {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter no. of rows");
            int row = sc.nextInt();
            System.out.println("Enter your coloum no.");
            int column = sc.nextInt();

            int [][] array1 = new int [row][ column];
            for(int i = 0; i<row; i++)
            {
                  for(int j = 0; j<column; j++)
                  {
                        array1 [i][j] = sc.nextInt();
                  }
            }
      
            System.out.println("Enter no. of rows");
            int row1 = sc.nextInt();
            System.out.println("Enter your coloum no.");
            int column1 = sc.nextInt();
            int [][] array2 = new int[row1][column1];
            for(int i = 0; i<row; i++)
            {
                  for(int j = 0; j<column; j++)
                  {
                        array2 [i][j] = sc.nextInt();
                  }
                  
            }

            // int [][] array3 = new int[row][column];
            // for(int i = 0; i<row; i++)
            // {
            //       for(int j = 0; j<column; j++)
            //       {
            //             array3[i,j] = 0;

                  
            //       }
            //       for(int k = 0; k<column)
            // }
            
      

      
      }
      
}
