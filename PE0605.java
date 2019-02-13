/*
Omar Wahby, period 6.
File Name: PE0605.java

This program reads in three double values and displays them in order
from least to greatest.
*/

import java.util.Scanner;

public class PE0605
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    double num1, num2, num3;
    System.out.println("Enter the three integers you want to compare: ");
    num1 = in.nextDouble();
    num2 = in.nextDouble();
    num3 = in.nextDouble();

    displaySortedNumbers(num1, num2, num3);
  }

  public static void displaySortedNumbers(double num1, double num2, double num3)
  {
    double largestNum=0, middleNum=0, smallestNum=0;
    double n;
    for(int i=1; i<=3; i++)
    {
      if(i == 1)
      n = num1;
      else if(i == 2)
      n = num2;
      else
      n = num3;

      if(n>largestNum)
      {
        smallestNum = middleNum;
        middleNum = largestNum;
        largestNum = n;
      }
      else if(n>middleNum)
       {
         smallestNum = middleNum;
         middleNum = n;
       }

      else
        smallestNum = n;
    }
      System.out.println("The order of the numbers from least to greatest is: ");
      System.out.println(smallestNum + " , " + middleNum + " , " + largestNum);
  }
}
