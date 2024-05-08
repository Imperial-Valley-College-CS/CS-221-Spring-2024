public class MyFirstProgram
{
   public static void main(String[] args)
   {
      System.out.println("Name: Octavio Ortiz");
      System.out.println("Major: Aerospace Engineering");
      System.out.println("Age: 36");
      
      System.out.println( someMethod("10011") );
   }//end main
   
   public static int someMethod(String str)
   {
   	int val = 0;
   	int j = 0;
   	for( int i = str.length()-1; i>=0; i--)
   	{
   		String x = str.substring(i, i+1);
   		val += Integer.parseInt(x)*Math.pow(2,j);
   		j++;
   	}
   	return val;
   }
   
} //end MyFirstProgram