/*
Omar Wahby, period 6.
File Name: PE0524.java

This program outputs the sum of the arithmetic series (1/3) +
(3/5) + ... + (97/99).
*/

import java.util.Scanner;

public class PE0524
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    double fraction = 0, denominator = 3;
    int numerator = 1;
    int n = 1;
    double sum = 0;

    while(numerator <= 97)
    {
      numerator = 2*(n) - 1;
      denominator = 2*(n) + 1;
      fraction = numerator / denominator;
      sum = sum + fraction;
      n++;


    }
    System.out.println("The sum of the series is: " + sum);
  }
}
