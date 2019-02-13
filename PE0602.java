/*
Omar Wahby, period 6.
File Name: PE0602.java

This program reads in an integer and outputs the sum of its digits.
*/

import java.util.Scanner;

public class PE0602
{
  public static void main(String[] args)
  {
    int n=0;
    Scanner in = new Scanner(System.in);
    System.out.println("Enter an integer: ");
    n = in.nextInt();

    sumDigits(n);
    System.out.println("The sum of the integer's digits is: " + sumDigits(n));

  }

  public static int sumDigits(int n)
  {
    int sum = 0;
    int remainder = 0;
    while(n>0)
    {
      remainder = n % 10;
      n = n/10;
      sum += remainder;
    }


    return sum;
  }
}
