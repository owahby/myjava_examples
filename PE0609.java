/*
Omar Wahby. period 6.
File Name: PE0609.java

This program displays a table of conversions from 0-10 feet to meters and
20-65 meters to feet in intervals of 5.
*/

public class PE0609
{
  public static void main(String[] args)
  {
    System.out.println("feet\tMeters\t|\tMeters\tFeet");
    System.out.println("-----------------------------------------");
    double m = 20.0;
    for(double n=1; n<=10; n++)
    {
      System.out.println(n + "\t" + feetToMeter(n) + "\t|\t" + m + "\t" + meterToFeet(m));
      m+=5;
    }
  }

  public static double feetToMeter(double feet)
  {
    return 0.305*feet;
  }

  public static double meterToFeet(double meter)
  {
    return 3.279*meter;
  }
}
