/*
Omar Wahby, period 6.
File name: DogNames.java

This program reads in a list of dog names and outputs them sorted in
alphabetical order. Assume the max number of names you're reading in
is 200 and the last line in the input is [END].
*/

import java.util.Scanner;

public class DogNames
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    String[] names = new String[200];
    String input ="";
    int count = 0;

    for(int i=0; i<names.length; i++)
      names[i] = "";

    System.out.println("Enter in a max of 200 dog names: ");
    input = in.next();

    while(!(input.equals("[END]")))
    {
      names[count] = input;
      count++;
      input = in.next();
    }

    alpha(names, count);

    System.out.println("The names in alphabetical order are: ");

    for(int i=0; i<count; i++)
      System.out.println(names[i] + " ");

    System.out.println();
  }

  //Using insertion sort to order the names alphabetically,
  public static void alpha(String[] names, int count)
  {
    for(int i=1; i<count; i++)
    {
      int j=i;
      while(j>0 && (names[j].compareTo(names[j-1]) < 0))
      {
        swap(names, j, j-1);
        j=j-1;
      }
    }
  }

  public static void swap(String[] names, int a, int b)
  {
    String temp = names[a];
    names[a] = names[b];
    names[b] = temp;
  }
}
