import java.util.*;
public class checkVowelConsonant {

      public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter yor Alphabet:-");
            char a = input.next().charAt(0);
            // Type 1:-

            /*switch(a){
                  case 'a':
                  case 'A':
                        System.out.println("Vowel");
                        break;
                  case 'e':
                  case 'E':
                        System.out.println("Vowel");
                        break;
                  case 'i':
                  case 'I':
                        System.out.println("Vowel");
                        break;
                        
                  case 'o':
                  case 'O':
                        System.out.println("Vowel");
                        break;
                  case 'u':
                  case 'U':
                        System.out.println("Vowel");
                        break;
                  default:
                         System.out.println("Consonant");                       
               }*/
               
               // Type 2:-

               if(a>='a' && a<='z' || a>= 'A' && a<= 'Z')
               {
                  switch(a){
                        case 'a':
                        case 'A':
                        case 'e':
                        case 'E':
                        case 'i':
                        case 'I':
                        case 'o':
                        case 'O':
                        case 'u':
                        case 'U':
                              System.out.println(" This is vowel");
                              break;
                        default:
                              System.out.println(" This se Consonent");
                  }      
                  }
                  else {
                        System.out.println("This is not a Alphabet");
                  }           


                  
               
               
               
               
               
               
               
               
               
               
               
               
               
               
               
               
               
               
               
               
               
               
               
               
               
               
               
               
               
               
               
               
               
               
               
               
               
               
               
      }
}