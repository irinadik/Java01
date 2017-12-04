package by.part1.homework;

public class HomeWork4 {

  //  Complete the program which takes date in number format and then makes its addition of the digits until
// the last digit remains single and the print the number as lucky number.
// example if input is 777 then 7+7+7 =21 = 2+1 =3 so the answer is 3.
  public static void main(String[] args) {
    int d = 30112017;

    while (d >= 10) {
      int sum = 0;

      do {
        sum += d % 10;
        d /= 10;
      } while (d > 0);

      d = sum;
    }

    System.out.println(d);
  }
}
