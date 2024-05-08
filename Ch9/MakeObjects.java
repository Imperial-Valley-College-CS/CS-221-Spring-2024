public class MakeObjects
{
   public static void main(String[] args)
   {
      String title = "Legend of Zelda: Ocarina of Time";
      String releaseDate = "11-21-1998";
      int copies = 7600000;
      String platform = "Multi-console";
      
      Videogame v = new Videogame(title, releaseDate, copies, platform);
      Videogame v1 = new Videogame("Baldur's Gate 3", "5-18-22", 600000, "Play-Station");
      
      System.out.println( v );
   }
}