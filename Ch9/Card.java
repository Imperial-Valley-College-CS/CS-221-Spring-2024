public class Card
{
   private char rank, suit;
   private String card;
   private int value;
   
   public Card(String symbol)    //symbol = "AH" "10D";
   {
      this.rank = symbol.charAt(0);
      this.suit = symbol.charAt(1);
      if( symbol.length() > 2 )
         this.suit = symbol.charAt(2);
         
      setValue();
   }
   
   private void setValue()
   {
      switch( this.rank )
      {
         case '2': this.value = 2; break;
         case '9': this.value = 9; break;
         case '1':
         case 'J': 
         case 'Q':
         case 'K':
            this.value = 10; break;
         case 'A':
            this.value = 1; break;
      }
   }
}