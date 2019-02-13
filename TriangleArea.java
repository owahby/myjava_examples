/*
Omar Wahby, period 6.
File name: ThreeDLine.java

This program reads in the three sides to a triangle
and then outputs its area. The program will not stop
until the user wants to.
*/
import java.util.Scanner;

public class TriangleArea
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    double a, b, c, s;
    String done = "N";

    while(done.equals("N"))
    {
      System.out.println("Enter the triangle's side lengths:");
      System.out.print("  a:  ");
      a = in.nextDouble();
      System.out.print("  b:  ");
      b = in.nextDouble();
      System.out.print("  c:  ");
      c = in.nextDouble();

      area(a, b, c);

      System.out.print("Are you done? [Y/N]");
      done = in.next();


    }
  }
  public static void area(double a, double b, double c)
  {
    double s = (a + b + c)/2.0;
    double area = Math.pow(s*(s-a)*(s-b)*(s-c), 0.5);

    System.out.println("Area = " + area);
  }
}
