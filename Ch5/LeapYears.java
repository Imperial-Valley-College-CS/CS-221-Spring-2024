public class LeapYears
{
   public static void main(String[] args)
   {
      int startYear = 1892;
      int endYear = 1912;
      
      for( int year = startYear; year <= endYear; year++)
      {
         if(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
            System.out.println( year );
      }
   }
}