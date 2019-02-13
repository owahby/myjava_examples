/*
Omar Wahby, period 6.
File Name: PosIntsData.java

This reads in up to 500 positive integers and then outputs the number
of integers that are 1 digit, 2 digits, 3 digits, or 4 or more digits

@author Omar Wahby
@author Mr. Dagler
*/
import java.util.Scanner;

public class PosIntsData
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    int[] values = new int[500];
    int input;
    int numOfVals = 0;
    int numOfOneDigits = 0, numOfTwoDigits = 0, numOfThreeDigits = 0;
    int numOfFourOrMoreDigits = 0;

    //Reading in all of the values into the array.
    input = in.nextInt();
    while(input > 0)
    {
      values[numOfVals] = input;
      numOfVals++;
      input = in.nextInt();
    }

    for(int i=0; i<values.length; i++)
    {
      if(values[i] < 10)
        numOfOneDigits++;
      else if(values[i] < 100)
        numOfTwoDigits++;
      else if(values[i] < 1000)
        numOfThreeDigits++;
      else
        numOfFourOrMoreDigits++;
    }



    System.out.println("The number of one digit integers = " + numOfOneDigits);
    System.out.println("The number of two digit integers = " + numOfTwoDigits);
    System.out.println("The number of three digit integers = " + numOfThreeDigits);
    System.out.println("The number of four digit integers = " + numOfFourOrMoreDigits);
  }
}
