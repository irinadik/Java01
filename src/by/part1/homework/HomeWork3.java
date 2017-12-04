package by.part1.homework;

public class HomeWork3 {

  //  Write a program which takes input as string and check if it is palindrome or not.
// If the string and the reverse of string are same then we say string is palindrome.
  public static void main(String[] args) {

    String s1 = "level";
    String s2 = "something";
    String s3 = "abba";

    System.out.println(s1 + " is palindrome: " + isPalindrome(s1));
    System.out.println(s2 + " is palindrome: " + isPalindrome(s2));
    System.out.println(s3 + " is palindrome: " + isPalindrome(s3));
  }

  private static boolean isPalindrome(String s) {
    char[] chars = s.toCharArray();

    int i = 0, j = chars.length - 1;

    while (i < j) {
      if (chars[i] != chars[j]) {
        return false;
      }
      i++;
      j--;
    }

    return true;
  }
}
