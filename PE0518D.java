/*
Omar Wahby, period 6.
File Name: PE0518D.java

*/

public class PE0518D
{
  public static void main(String[] args)

  {
    int n = 6;

    for(int i=1; i<=n; n--)
    {
      for(int j=5; j>n-i; j--)
          System.out.print("  ");
      for(int j=1; j<=n; j++)
          System.out.print(j + " ");

      System.out.println();
    }

  }
}
