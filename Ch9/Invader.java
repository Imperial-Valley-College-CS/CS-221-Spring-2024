//package PA12_Objects.src.main.java;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Invader
{
   //data fields
   private boolean[][] body;
   private String filename;
   
   //constructor(s)
   public Invader(String filename, double x, double y)
   {
      this.body = new boolean[8][12];
      switch( filename.toLowerCase() )
      {
         case "squid": this.filename = "SquidMatrix.txt"; break;
         case "crab": this.filename = "CrabMatrix.txt"; break;
         case "octopus": this.filename = "OctopusMatrix.txt"; break;
      }
      setBody();     //invoke setBody
   }
   
   //methods   
   public boolean[][] getBody()
   {
      return this.body;
   }
   
   private void setBody()
   {
      try
      {
         File f = new File("InvaderMatrices/" + this.filename);
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
}//end Invader