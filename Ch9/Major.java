import java.util.ArrayList;

public class Major
{
   //data fields
   private String name;
   private boolean isImpacted, calculusBased;
   private ArrayList<Course> coreClasses = new ArrayList<>();
   
   //constructor(s)
   public Major( String n, boolean i, boolean calc )
   {
      this.name = n;
      this.isImpacted = i;
      this.calculusBased = calc;
   }
   
   //methods
   public void addCourse(Course c)
   {
      this.coreClasses.add(c);
   }
   
   public void addCourse(int index, Course c)
   {
      this.coreClasses.add(index, c);
   }
   
   @Override
   public String toString()
   {
      String info = this.name + "\n";
      
      for( Course x : this.coreClasses )
         info += "\t**" + x.toString() + "\n";
         
      return info;
   }
}