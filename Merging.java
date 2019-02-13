/*
Omar Wahby, period 6.
File name: Merging.java

This program reads in two separate arrays of sorted positive
integers and adds them to a new array so that it is also sorted.

It will also read in how many integers are in the first array
and then read in its values. The same applies to the second array.

It also sorts the numbers as they are entered into the array.
*/
import java.util.Scanner;
import java.util.Arrays;

public class Merging
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    int[] array1;
    int[] array2;
    int numOfElementsA1 = 0;
    int numOfElementsA2 = 0;
    int input;
    int count = 0;

    //Reading in and storing values for array 1,
    System.out.println("How many integers in the first array: ");
    numOfElementsA1 = in.nextInt();

    array1 = new int[numOfElementsA1];

    System.out.println("Enter the first array: ");
    input = in.nextInt();

    while(input > 0)
    {
      array1[count] = input;
      count++;
      input = in.nextInt();
    }

    //Reading in and storing in the values for array 2,
    System.out.println("How many integers in the second array: ");
    numOfElementsA2 = in.nextInt();

    array2 = new int[numOfElementsA2];

    System.out.println("Enter the second array: ");
    input = in.nextInt();

    //Resetting the count to zero for array 2,
    count = 0;
    while(input > 0)
    {
      array2[count] = input;
      count++;
      input = in.nextInt();
    }

    //This is the new array that both arrays will be combined into.
    int[] array3 = new int[numOfElementsA1 + numOfElementsA2];

    //Calling the method to sort the new array,
    merge(array3, array1, array2);

    //Printing the new sorted array,
    System.out.println("The new sorted array: ");
    for(int i=0; i<array3.length; i++)
      System.out.print(array3[i] + " ");

    System.out.println();
  }

  public static void merge(int[] C, int[] A, int[] B)
  {
    //Declare "i" seperately to prevent the elements in array B from
    //overriding those in array A.
    int i;
    for(i=0; i<A.length; i++)
      C[i] = A[i];

    for(int j=0; j<B.length; j++)
      C[i++] = B[j];

    sort(C);
  }

  public static void sort(int[] C)
  {
    for(int i=1; i<C.length; i++)
    {
      int j=i;
      //Comparing the indexes of array C
      while(j>0 && (C[j] < C[j-1]))
      {
        swap(C, j, j-1);
        j=j-1;
      }
    }
  }
  public static void swap(int[] C, int a, int b)
  {
    int temp = C[a];
    C[a] = C[b];
    C[b] = temp;
  }
}
