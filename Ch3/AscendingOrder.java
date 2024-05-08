public class AscendingOrder
{
   public static void main(String[] args)
   {
      int num1 = 3;
      int num2 = 1;
      int num3 = 5;
      
      if( num1 <= num2 && num1 <= num3 )
      {
         System.out.print( num1 + ", " );
         if( num2 < num3 )
            System.out.print( num2 + ", " + num3 + "\n");
         else
            System.out.print( num3 + ", " + num2 + "\n");
      }      
      else if( num2 <= num1 && num2 <= num3 )
      {
         System.out.print( num2 + ", " );
         if( num1 < num3 )
            System.out.print( num1 + ", " + num3 + "\n");
         else
            System.out.print( num3 + ", " + num1 + "\n");
      }
      
   }//end main
}//end class