/*
Omar Wahby, period 6.
File name: ThreeDLine.java

This program reads in the endpoints of a 3D line segment
and then outputs its midpoint. The program will not stop
until the user wants to.
*/
import java.util.Scanner;

public class ThreeDLine
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    double x1Val, y1Val, z1Val;
    double x2Val, y2Val, z2Val;
    String done = "N";

    while(done.equals("N"))
    {
      System.out.println("Enter the first point:");
      System.out.print("  x1:  ");
      x1Val = in.nextDouble();
      System.out.print("  y1:  ");
      y1Val = in.nextDouble();
      System.out.print("  z1:  ");
      z1Val = in.nextDouble();

      System.out.println("Enter the second point:");
      System.out.print("  x1:  ");
      x2Val = in.nextDouble();
      System.out.print("  y1:  ");
      y2Val = in.nextDouble();
      System.out.print("  z1:  ");
      z2Val = in.nextDouble();

      midPoint(x1Val, y1Val, z1Val, x2Val, y2Val, z2Val);

      System.out.print("Are you done? [Y/N]");
      done = in.next();


    }
  }
  public static void midPoint(double x1, double y1, double z1, double x2, double y2, double z2)
  {
    double midX = (x1+x2)/2.0;
    double midY = (y1+y2)/2.0;
    double midZ = (z1+z2)/2.0;

    System.out.println("Midpoint = (" + midX + ", " + midY + ", " + midZ + ")");
  }
}
