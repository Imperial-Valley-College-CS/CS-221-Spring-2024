public class Craps
{
   public static void main(String[] args)
   {
      System.out.print("Do you want to roll? ");
      String answer = "yes";     //scan from user with Scanner object
      
      if(answer.equals("yes"))
      {
         boolean gameOver = false;
         int sum;
         
         do{
            int die1 = (int)(6*Math.random())+1;
            int die2 = (int)(6*Math.random())+1;
            sum = die1 + die2;
            System.out.println("You rolled a " + sum);
            if(sum == 2 || sum == 3 || sum == 7 || sum == 11 || sum == 12)
            {
               gameOver = true;
            }
         }while( !gameOver );
         
         if( sum == 7 || sum == 11 )
            System.out.println("You won!");
         else 
            System.out.println("You lost!");
      }else
      {
         System.out.println("Okidoki. See ya later.");
      }
   }//end main
}//end class