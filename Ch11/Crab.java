import javafx.scene.paint.Color;

public class Crab extends Invader
{
   private String[] crabFiles = {"/CrabMatrix.txt", "/HurtCrabMatrix.txt"};
   
   public Crab(double x, double y)
   {
      super(x, y);      //invoke constructor of superclass
      super.matDir = super.userDir+this.crabFiles[0];
      super.setBody();
      super.color = Color.rgb(255, 0, 160);    //orange
      super.health = this.crabFiles.length;
   }
   
   //methods
   @Override
   public boolean hit()
   {
      if( super.hit() )
      {
         int index = this.crabFiles.length - super.health;
         super.matDir = super.userDir + this.crabFiles[index];
         super.setBody();
      }
      
      return this.isAlive;
   }
}