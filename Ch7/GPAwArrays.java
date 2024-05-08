import java.util.Scanner;

public class GPAwArrays
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      
      System.out.print("How many classes are you taking? ");
      int x = scan.nextInt();
      scan.nextLine();              //eats leftover \n from above
      char[] grades = new char[x];   
      
      for( int i = 0; i < grades.length; i++ )
      {
         System.out.print("Enter grade: " );
         grades[i] = scan.nextLine().toUpperCase().charAt(0);
      }   
      
      double ans = gpa(grades);
      System.out.println( "GPA: " + ans );
   }//end main
   
   public static double gpa(char[] grs)
   {
      double sum = 0;
      
      for( int i = 0; i < grs.length; i++ )
      {
         if( grs[i] == 'A' || grs[i] == 'a' )
            sum += 4.0;
         if( grs[i] == 'B' || grs[i] == 'b' )
            sum += 3.0;
         if( grs[i] == 'C' || grs[i] == 'c' )
            sum += 2.0;
         if( grs[i] == 'D' || grs[i] == 'd' )
            sum += 1.0;
      }
      return sum/grs.length;
   }//end gpa
}