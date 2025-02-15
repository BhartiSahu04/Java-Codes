import java.util.*;
public class ArrayatkingInputFromUser {
      public static void PrintArr(int arr[]){
            System.out.println("Given array is :-");
            for(int j = 0; j<=arr.length; j++){
                  System.out.println(arr[j] + " ");

            }
      }
      public static void main(String[] args) {
            int num;
            try(Scanner sc = new Scanner(System.in)){
                  System.out.println("Enter the number of element:-");
                  num = sc.nextInt();
                  System.out.println("Enter the elemtnt of array:-");
                  int [] arr = new int[num];
                  for(int i = 0; i <= num ;i++){
                        arr[i] = sc.nextInt();
                  }
                  PrintArr(null);
            }
            
      }
      
      
}
