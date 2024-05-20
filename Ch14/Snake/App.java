import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.*;
import javafx.scene.canvas.*;
import javafx.scene.paint.Color;
import javafx.scene.image.Image;
import javafx.animation.AnimationTimer;

public class App extends Application
{
   int windowSize = 500;
   Group g = new Group();
   Canvas canvas = new Canvas(windowSize,windowSize);
   GraphicsContext gc = canvas.getGraphicsContext2D();
   Scene scene = new Scene(g); 
   Image hulk = new Image("https://upload.wikimedia.org/wikipedia/commons/thumb/a/a0/Hulk_%282540708438%29.jpg/480px-Hulk_%282540708438%29.jpg");  
   Timer timer = new Timer();
   double x = 0;
   double y = 100;
   double size = 10;
   int dir = 1;
   
   @Override
   public void start(Stage s)
   {    
      timer.start();                //starts timer (invokes handle method on every frame)
      g.getChildren().add(canvas);
      //gc.drawImage(hulk, 0, 0);
      s.setScene(scene);
      s.show();
   }
   
   public void move()
   {
      gc.setFill(Color.BLACK);         //background Color  
      gc.fillRect(0, 0, windowSize, windowSize);
      
      gc.setFill(Color.BLUE);         //snake color  
      gc.fillRect(x, y, size, size);
      
      x += dir*5*size;
      
      if( x > windowSize || x < 0 )
         dir *= -1;
   }
   
   //inner class
   class Timer extends AnimationTimer
   {
      long dt = 16000000;     //approximate time in between frames (0.016 seconds) 62.5 Hz
      long last = dt;
      
      @Override
      public void handle(long now)     //handle method is invoked on every frame
      {
         // if( now - last > 3*dt )       //wait three frames
//          {
//             move();     //run code in move method every frame
//             last = now;
//          }
         move();
      }
   }
}