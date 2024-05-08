//package PA3_Input.src.main.java;

import java.util.Scanner;

public class CalculateGPA
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      
      System.out.print("Enter first grade point: ");
      double gp1 = scan.nextDouble();
      
      System.out.print("Enter second grade point: ");
      double gp2 = scan.nextDouble();
      
      double gpa = (gp1+gp2)/2.0;
      System.out.printf("Your GPA: %.2f", gpa);
      
   }//end main
}//end class