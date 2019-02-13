/*
Omar Wahby, period 6.
File Name: PE0518C.java
*/

public class PE0518C
{
  public static void main(String[] args)
  {
    int n=6;

    for(int i=1; n>=i; i++)
    {
      for(int j=1; j<=n-i; j++)
        System.out.print("  ");

      for(int j=i; j>=1; j--)
      {
        System.out.print(j + " ");
      }
      System.out.println();
    }

  }
}
