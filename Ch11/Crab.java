import javafx.scene.paint.Color;

public class Crab extends Invader
{
   private String[] crabFiles = {"/CrabMatrix.txt", "/HurtCrabMatrix.txt"};
   
   public Crab(double x, double y)
   {
      super(x, y);      //invoke constructor of superclass
      super.matDir = super.userDir+crabFiles[0];
      super.setBody();
      super.color = Color.rgb(255, 0, 160);    //orange
      super.health = this.crabFiles.length;
   }
   
   //methods
   @Override
   public boolean hit()
   {
      if( super.hit() )      //invoke hit method of super class
      {
         int index = this.crabFiles.length-super.health;
         super.matDir = super.userDir+crabFiles[index];
         super.setBody();        //invoke setBody with updated matDir
      }
      return this.isAlive;      
   }
}