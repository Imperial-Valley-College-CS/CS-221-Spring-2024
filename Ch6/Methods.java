public class Methods
{
   public static void main(String[] args)
   {
      for( int i = 2; i <= 10000; i++ )
         if( perfectNumber(i) )
            System.out.println( i );
            
   }//end main
   
   public static boolean perfectNumber(int num)
   {
      int sum = 1;
      int i = 2;
      
      while( i <= num/2 )
      {
         if( num % i == 0 )
         {
            sum += i;
         }
         i++;
      }
      
      return (num == sum);
   }
   
   public static boolean inCircle(double r, double x, double y, double x1, double y1)
   {      
      //calculate distance between (x,y) and (x1,y1)
      double aa = Math.pow((x-x1),2);
      double bb = Math.pow((y-y1),2);
      double dist = Math.sqrt( aa+bb );
      System.out.println( dist );
      //compare distance to radius
      if( dist < r )
         return true;
      else 
         return false;
   }//end inCircle

   public static int max(int a, int b)
   {
      if( a > b )
         return a;
      else
         return b;
   }//end max
}//end class