/*
This reads in a sentence and then outputs it in reverse order.

@author Omar Wahby
*/

import java.util.Scanner;

public class SentenceReverse
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    String sentence = "";
    String[] words;

    System.out.println("Enter a sentence: ");
    sentence = in.nextLine();

    words = sentence.split(" ");

    for(int i=words.length-1; i>=0; i--)
      System.out.print(words[i] + " ");

    System.out.println();
  }
}
