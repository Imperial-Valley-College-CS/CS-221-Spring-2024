public class Card
{
   public static void main(String[] args)
   {
      String card = "QS";
      char rank = card.toLowerCase().charAt(0);
      char suit = card.toLowerCase().charAt(card.length()-1);
      
      switch( rank )
      {
         case '2':
            System.out.println( "Two of " );
            break;
         case '1':
            System.out.println( "Ten of " );
            break;
      }
      
      switch( suit )
      {
         case 'c':
            System.out.println( "Clubs" );
            break;
      }
   }
}