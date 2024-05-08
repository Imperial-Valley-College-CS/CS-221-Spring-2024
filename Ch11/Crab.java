import javafx.scene.paint.Color;

public class Crab extends Invader
{
   public Crab(double x, double y)
   {
      super(x, y);      //invoke constructor of superclass
      super.color = Color.rgb(255, 0, 160);    //orange
   }
}