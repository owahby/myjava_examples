/**
 * Omar Wahby, period 6.
 * File Name: SelectionSort_v3.java

 * Unlike SelectionSort.java, this program rearranges the array
 * read in from greatest to least.
 *
 * 
 * @author Omar Wahby
 */

import java.lang.Math;

class SelectionSort_v3
{
   public static void main(String[] args)
   {
      final int N = 30;
      int[] vals = new int[N];

      for(int i=0; i<vals.length; i++)
         vals[i] = (int)(1000*Math.random()+1);

      System.out.println("Here are the values before they are sorted:");
      for(int v : vals)
         System.out.print(v + " ");
      System.out.println();

      selectionSort(vals);

      System.out.println("Here are the values after they are sorted:");
      for(int v : vals)
         System.out.print(v + " ");
      System.out.println();

   }

   //This does so by sorting the array from right to left.
   //The swapping is just like the original method,
   //but shifts the min index to the right.
   static void selectionSort(int[] elements)
   {
      for(int j=elements.length-1; j>0; j--)
      {
        int minIndex=j;
        for(int k=j-1; k>=0; k--)
        {
          if(elements[k] < elements[minIndex])
            minIndex = k;
        }

        int temp = elements[j];
        elements[j] = elements[minIndex];
        elements[minIndex] = temp;
      }
   }
}
