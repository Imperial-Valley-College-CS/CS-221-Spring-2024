//package PA13_Inheritance.src.main.java;

public class Position
{
   //data fields
   private double x, y;
   
   //constructor
   public Position( double a, double b )
   {
      this.x = a;
      this.y = b;
   }
   
   //methods
   public double getX(){ return this.x; }
   public double getY(){ return this.y; }
   public void setX( double x )
   {
      this.x = x;
   }
   public void setY( double y )
   {
      this.y = y;
   }
}