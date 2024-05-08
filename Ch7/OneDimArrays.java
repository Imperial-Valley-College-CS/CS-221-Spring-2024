import java.util.Arrays;

public class OneDimArrays
{
   public static void main(String[] args)
   {
      int[] a = {12, 8, 3};
      int[] b = {21, 10, 5};
      int[] ans = merge(a, b);     
      
      String arr = Arrays.toString(ans);
      System.out.println( arr ); 
   }//end main
   
   public static int[] merge(int[] a, int[] b)
   {
      int[] newArr = new int[a.length+b.length];
      int k = 0;
      int i = 0;
      int j = 0;
      
      while( k < newArr.length )
      {
         if( j < a.length && i < b.length )
         {
            if( a[j] > b[i] )
            {
               newArr[k] = a[j];
               j++;
            }else
            {
               newArr[k] = b[i];
               i++;
            }
         }else if( j >= a.length) //array "a" has been exhausted
         {
            newArr[k] = b[i];
            i++;
         }else if( i >= b.length) //array "b" has been exhausted
         {
            newArr[k] = a[j];
            j++;
         }
         
         k++;
      }//end while
      
      return newArr;   //placeholder
   }
   
}//end class