import javafx.scene.paint.Color;

public class Squid extends Invader
{
   private String[] squidFiles = {"/SquidMatrix.txt"};
   
   public Squid(double x, double y)
   {
      super(x, y);      //invoke constructor of superclass
      super.matDir = super.userDir+squidFiles[0];
      super.setBody();
      super.health = this.squidFiles.length;
      System.out.println( super.matDir );
      super.color = Color.rgb(240, 240, 20);    //yellow
   }
}