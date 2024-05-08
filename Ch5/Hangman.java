import java.util.Scanner;

public class Hangman
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      String word = "summer";
      String guess = "++++++";
      while( !word.equals(guess) )
      {
         String empty = "";
         System.out.print( "Enter a character: " );
         char letter = scan.nextLine().charAt(0);
         
         for( int i = 0; i < word.length(); i++ )
         {
            char nextChar = word.charAt(i);
            if( nextChar == letter )
            {
               empty = empty + nextChar;
            }else
            {
               empty = empty + guess.charAt(i);
            }
         }
         guess = empty;
         System.out.println( guess );
      }
   }//end main
}//end class