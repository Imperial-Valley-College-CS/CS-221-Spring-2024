public class Roster
{
   public static void main(String[] args)
   {
      Course c1 = new Course("CS 221", "Intro to Prg", 3.0);
      Course c2 = new Course("CS 231", "Intro to Data Structure", 3.0);
      Course c3 = new Course("CS 281", "Assembly Language", 3.0);
      Major major = new Major("Computer Science", true, true);
      
      major.addCourse(c1);
      major.addCourse(c2);
      major.addCourse(c3);
      
      System.out.println( major );
      
      Student s = new Student("Alicia Marquez", 27, "G00720022", "7-3-2005");
   }
}