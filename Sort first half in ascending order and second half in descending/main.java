
import java.util.*;

class Main
{
    static void printOrder(int[] a, int n)
    { 
       int[] arr = {4, 3, 8, 5, 2, 7, 0, 9};
       Arrays.sort(arr);
      for (int i = 0; i < n / 2; i++)
      {
          System.out.print(arr[i] + " ");
      }
      for (int j = n - 1; j >= n / 2; j--)
      {
         System.out.print(arr[j] + " ");
      }

   }
   public static void main(String[] args)
   {
      int[] arr = {4, 3, 8, 5, 2, 7, 0, 9};
      int n = arr.length;
      printOrder(arr, n);
   }
}
