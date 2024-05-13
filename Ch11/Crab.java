import javafx.scene.paint.Color;

public class Crab extends Invader
{
   private String[] crabFiles = {"/CrabMatrix.txt", "/HurtCrabMatrix.txt"};
   
   public Crab(double x, double y)
   {
      super(x, y);      //invoke constructor of superclass
      super.matDir = super.userDir+crabFiles[0];
      super.color = Color.rgb(255, 0, 160);    //orange
   }
}