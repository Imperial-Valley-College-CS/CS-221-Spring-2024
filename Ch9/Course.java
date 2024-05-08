public class Course
{
   //data fields
   private String number, title, description;
   private double credits;
   
   //constructor(s)
   public Course(String a, String b, double c)
   {  
      this.number = a;
      this.title = b;
      this.credits = c;
   }
   
   //methods
   @Override
   public String toString()
   {
      return String.format("%-10s -- %-25s -- %.2f", this.number, this.title, this.credits);
   }   
}