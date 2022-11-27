//sorting
import java.util.*;
class Sorting
{
   static void bubble_sort(int arr[], int len_arr)
   {
      if (len_arr == 1)
      return;
      for (int i=0; i<len_arr-1; i++)
      {
      if (arr[i] > arr[i+1])
      {
         int temp = arr[i];
         arr[i] = arr[i+1];
         arr[i+1] = temp;
      }
    }
      bubble_sort(arr, len_arr-1);
   }
   public static void main(String[] args)
   {
      int arr[] = {45, 67, 89, 31, 63, 0, 21, 12};
      bubble_sort(arr, arr.length);
      System.out.println("The array after bubble sort is ");
      System.out.println(Arrays.toString(arr));
   }
}