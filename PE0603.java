/*
Omar Wahby, period 6.
File Name: PE0603.java

This solves Problem 6.3 on page 215 of our book.
It reads in an integer and determines if it is a palindrome.

@author Mr. Dagler
*/

import java.util.Scanner;

public class PE0603
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    int input;

    System.out.print("Enter an integer value: ");
    input = in.nextInt();

    if(isPalindrome(input))
      System.out.println(input + " is a palindrome!");
    else
      System.out.println(input + " is not a palindrome.");
  }

  public static int reverse(int number)
  {
    String str = number + "";
    String answer = "";

    for(int i=0; i<str.length(); i++)
    {
      answer = str.charAt(i) + answer;
    }
    return Integer.parseInt(answer);
  }

  public static boolean isPalindrome(int number)
  {
    return number == reverse(number);

  }
}
