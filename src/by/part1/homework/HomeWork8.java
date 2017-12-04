package by.part1.homework;

public class HomeWork8 {

  //  Write a program to read English text and print a count of word lengths,
// Example:
// the total number of words of length 1 which occurred, the number of length 2, and so on.
  public static void main(String[] args) {

    String str = "GitHub is a code hosting platform for version control and collaboration. It lets you and others work together on projects from anywhere.";

    String[] tokens = str.split("( )*[., !?:;-]( )*");
    int[] counters = new int[200];

    for (String token : tokens) {
      counters[token.length()]++;
    }

    for (int i = 0; i < counters.length; i++) {
      if (counters[i] > 0) {
        System.out.println("Total number of words of length " + i + ": " + counters[i]);
      }
    }
  }
}
