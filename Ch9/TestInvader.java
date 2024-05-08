import java.util.Arrays;

public class TestInvader
{
   public static void main(String[] args)
   {
      Invader vader = new Invader("octopus", 0.0, 0.0);
      boolean[][] body = vader.getBody();
      
      for(boolean[] row : body )
      {
         System.out.println( Arrays.toString(row) );
      }
   }
}