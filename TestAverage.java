/*
Omar Wahby, period 6.
File Name: TestAverge.java

This program reads in:
1) 3 integers
2) 4 integers
3) 3 doubles
4) 5 doubles

and finds the average of the values.
*/

public class TestAverage
{
  public static void main(String[] args)
  {
    System.out.println("The average of 1, 5, and 8 is: " + testAverage(1,5,8));
    System.out.println("The average of 1, 5, 6, and 8 is: " + testAverage(1,5,6,8));
    System.out.println("The average of 1.4, 5.8, and 8.6 is: " + testAverage(1.4,5.8,8.6));
    System.out.println("The average of 1.3, 5.7, 6.4, 8.1, and 9.8 is: " + testAverage(1.3,5.7,6.4,8.1,9.8));
  }

  public static double testAverage(int num1, int num2, int num3)
  {
    return (num1 + num2 + num3)/3.0;
  }

  public static double testAverage(int num1, int num2, int num3, int num4)
  {
    return (num1 + num2 + num3 + num4)/4.0;
  }

  public static double testAverage(double num1, double num2, double num3)
  {
    return (num1 + num2 + num3)/3.0;
  }

  public static double testAverage(double num1, double num2, double num3, double num4, double num5)
  {
    return (num1 + num2 + num3 + num4 + num5)/5.0;
  }
}
