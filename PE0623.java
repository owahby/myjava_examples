/*
Omar Wahby, period 6.
File Name: PE0623.java

This program contains a method that finds the number
of occurrences of a specified character in a string.
*/

import java.util.Scanner;

public class PE0623
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    Scanner input = new Scanner(System.in);
    String str, letter;
    char a;
    System.out.println("Enter a string: ");
    str = in.nextLine();
    System.out.println("Enter a specific character in that string: ");
    letter = in.next();

    a = letter.charAt(0);

    count(str, a);

    System.out.println("The number of occurrences of the character " + a + " in " + str + " is: " + count(str,a));

  }

  public static int count(String str, char a)
  {
    int count = 0;
    for(int b=0; b<str.length(); b++)
    {
      if(str.charAt(b) == a)
      {
        count++;
      }
    }
    return count;
  }




}
