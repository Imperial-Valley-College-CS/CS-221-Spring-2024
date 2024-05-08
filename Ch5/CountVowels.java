import java.util.Scanner;

public class CountVowels
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter your name: ");
      String str = scan.nextLine();
      int count = 0;
      
      for( int i = 0; i < str.length(); i++ )
      {
         char nextChar = str.toLowerCase().charAt(i);
         if( nextChar == 97 || nextChar == 'e' || nextChar == 'i' ||
             nextChar == 'o' || nextChar == 'u' )
         {
            count++;
         }//end if        
      }//end for
      System.out.println( "Number of vowels: " + count);
      
      
   }//end main
}