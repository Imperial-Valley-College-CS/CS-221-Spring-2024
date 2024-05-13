//package PA13_Inheritance.src.main.java;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import javafx.scene.paint.Color;

public class Invader
{
   //data fields
   protected int health, speedX, speedY;
   protected Color color;
   protected Position position;
   protected boolean[][] body;
   protected boolean isAlive;
   protected String userDir, matDir;
   
   //constructor(s)
   public Invader(double x, double y)
   {
      this.userDir = System.getProperty("user.dir");
      this.userDir += "/PA13_Inheritance/src/main/java/InvaderMatrices";
      this.body = new boolean[8][12];
      this.position = new Position(x, y);
      this.isAlive = true;
   }
   
   //methods   
   public boolean[][] getBody()
   {
      return this.body;
   }
   
   protected void setBody()
   {
      try
      {
         File f = new File(this.matDir);
         Scanner scan = new Scanner(f);
         
         int i = 0;
         while( i < this.body.length ) //8
         {
            String line = scan.nextLine();
            String[] tokens = line.split(",");
            for( int j = 0; j < this.body[i].length; j++ )
            {
               if( tokens[j].equals("1") )
                  this.body[i][j] = true;
               else
                  this.body[i][j] = false;
            }
            i++;
         }
         scan.close();
         
      }catch( FileNotFoundException e )
      {
         System.out.println( "File not found." );
      }
      
   }//end setBody
   
   public boolean hit()
   {
      this.health--;    //decrement health by one
      if( this.health <= 0 )
         this.isAlive = false;
         
      return this.isAlive;
   }
   
}//end Invader