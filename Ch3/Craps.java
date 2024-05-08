import java.util.Scanner;

public class Craps
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);   
      System.out.println("Do you you want to roll?");
      String ans = scan.next();
      if( ans.equals("yes") )
      {
         int scale = 6;
         int offset = 1;
         int die1 = (int)(scale*Math.random())+offset;
         int die2 = (int)(scale*Math.random())+offset;
         
         System.out.println("Your numbers: " + die1 + ", " + die2);
         
         if( (die1+die2) == 7 || (die1+die2) == 11 )
         {
            System.out.println( "You won!" );
         }
      }else
      {
         System.out.println("See you next time.");
      }
   }//end main
}//end class