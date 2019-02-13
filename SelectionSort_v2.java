/**
 * Omar Wahby, period 6.
 * File Name: SelectionSort_v2.java

 * Unlike SelectionSort.java, this program rearranges the array
 * read in from greatest to least.
 *
 * 
 * @author Omar Wahby
 */

import java.lang.Math;

class SelectionSort_v2
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

   //This does so by sorting the array from left to right and
   //keeping track of the max index of the entire array
   //and shifting the max index left.
   static void selectionSort(int[] elements)
   {
      for(int j=0; j<elements.length-1; j++)
      {
        //Finding the max index of the entire array,
        int maxIndex=j;
        for(int k=j+1; k<elements.length; k++)
        {
          if(elements[k] > elements[maxIndex])
            maxIndex = k;
        }

        int temp = elements[maxIndex];
        elements[maxIndex] = elements[j];
        elements[j] = temp;
      }
   }
}
