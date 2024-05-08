import javafx.scene.paint.Color;

public class Squid extends Invader
{
   public Squid(double x, double y)
   {
      super(x, y);      //invoke constructor of superclass
      super.color = Color.rgb(189, 24, 223);     //purple
   }
}