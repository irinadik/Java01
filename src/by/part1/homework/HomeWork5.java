package by.part1.homework;

public class HomeWork5 {

  //  Complete the following program which takes input as a number and converts it into string format.
// Initially arrays of string are given just use it for your logic.
// example: Enter the number: 54 Entered number is: fifty four

  private static String[] pos1 = {
          "",
          "one",
          "two",
          "three",
          "four",
          "five",
          "six",
          "seven",
          "eight",
          "nine",
          "ten",
          "eleven",
          "twelve",
          "thirteen",
          "fourteen",
          "fifteen",
          "sixteen",
          "seventeen",
          "eighteen",
          "nineteen"
  };

  private static String[] pos2 = {
          "",
          "ten",
          "twenty",
          "thirty",
          "forty",
          "fifty",
          "sixty",
          "seventy",
          "eighty",
          "ninety"
  };

  public static void main(String[] args) {

    int number = 2112010112;

    System.out.println("Enter the number: " + number + " Entered number is: " + convertNumberToString(number));
  }

  private static String convertNumberToString(int number) {

    if (number == 0) {
      return "zero";
    }

    String res = "";

    res = append(res, getGroupStr(number / 1000000000, "billion"));
    number %= 1000000000;
    res = append(res, getGroupStr(number / 1000000, "million"));
    number %= 1000000;
    res = append(res, getGroupStr(number / 1000, "thousand"));
    number %= 1000;
    res = append(res, getGroupStr(number, ""));

    return res;
  }

  private static String getGroupStr(int group3digits, String description) {

    String res = "";
    if (group3digits >= 100) {
      res = append(res, pos1[group3digits / 100] + " hundred");
      group3digits %= 100;
    }
    if (group3digits >= 20) {
      res = append(res, pos2[group3digits / 10]);
      group3digits %= 10;
    }
    res = append(res, pos1[group3digits]);

    return res.length() > 0 ? res + " " + description : res;
  }

  private static String append(String source, String appendix) {
    if (source == null || source.length() == 0) {
      return appendix;
    }

    return appendix.length() > 0 ? source + " " + appendix : source;
  }
}
