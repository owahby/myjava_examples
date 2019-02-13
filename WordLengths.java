/*
Omar Wahby, period 6
This first reads in an integer for the number
of words to read in followed by that many words.
Once this is done, output the word or words with
the shortest lengths.

@author Mr. Dagler
@author Omar Wahby
*/
import java.util.Scanner;
import java.lang.Integer;

public class WordLengths
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    //Creating the first part of the two-part array,
    String[] words;

    int numOfWords;
    int shortestLength = Integer.MAX_VALUE;
    String shortestWords = "";

    System.out.println("Enter the number of words: ");
    numOfWords = in.nextInt();

    //Creating the second part of the array,
    words = new String[numOfWords];

    //Reading in the words
    for(int i=0; i<words.length; i++)
      words[i] = in.next();

    //Determining the smallest word length,
    for(int i=0; i<words.length; i++)
    {
      //Since words[i] is a String, part of an array of Strings called "Words",
      if(words[i].length() < shortestLength)
        shortestLength = words[i].length();
    }

    //Finding the shortest words,
    for(int i=0; i<words.length; i++)
    {
      if(shortestLength == words[i].length())
        System.out.println(words[i]);
    }

  }
}
