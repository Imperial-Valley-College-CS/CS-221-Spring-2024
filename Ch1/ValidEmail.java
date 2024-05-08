import java.util.Scanner;

public class ValidEmail
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      
      System.out.print("Enter your name: " );
      String name = scan.nextLine();
      
      System.out.print("Enter proposed email: " );
      String email = scan.nextLine();
      
      char nameFirstI = name.toLowerCase().charAt(0);
      char emailFirstI = email.charAt(0);
      boolean equalFirstChars = nameFirstI == emailFirstI;
      
      System.out.println( equalFirstChars );
   }//end main
}//end class