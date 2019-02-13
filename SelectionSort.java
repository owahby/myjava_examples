/**
 * Omar Wahby, period 6.
 * File Name: SelectionSort.java
 *
 * @author Mr. Dagler
 * @author Omar Wahby
 */

import java.lang.Math;

class SelectionSort
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

   static void selectionSort(int[] A)
   {
      int smallestIndex = 0;
      for(int i=0; i<A.length; i++)
      {
        smallestIndex=i;
        for(int j=i+1; j<A.length; j++)
        {
          if(A[j] < A[smallestIndex])
            smallestIndex = j;
        }
        swap(A, i, smallestIndex);
      }
   }

   static void swap(int[] A, int a, int b)
   {
      int temp = A[a];
      A[a] = A[b];
      A[b] = temp;
   }
}
