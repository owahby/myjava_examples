/*
Omar Wahby, period 6.
File Name: SumSquares1.java

This program illustrates method overloading, which enables
the program to have the same method name, with different
parameter lists.

It does so by reading in:
1) 2 integers
2) 3 integers
3) 4 integers
4) 2 doubles

and computes the sum of their squares.
*/

public class SumSquares1
{
  public static void main(String[] args)
  {

    System.out.println("2^2 + 3^2 = " + sumSquares(2,3));
    System.out.println("1^2 + 2^2 + 3^2= " + sumSquares(2,3));
    System.out.println("5^2 + 1^2 + (-2)^2 + 10^2 = " + sumSquares(5,1,-2,10));
    System.out.println("1.2^2 + 3.4^2 = " + sumSquares(1.2,3.4));
  }

  public static int sumSquares(int num1, int num2)
  {
    return num1*num1 + num2*num2;
  }

  public static int sumSquares(int num1, int num2, int num3)
  {
    return num1*num1 + num2*num2 + num3*num3;
  }

  public static int sumSquares(int num1, int num2, int num3, int num4)
  {
    return num1*num1 + num2*num2 + num3*num3 + num4*num4;
  }

  public static double sumSquares(double val1, double val2)
  {
    return val1*val1 + val2*val2;
  }
}
