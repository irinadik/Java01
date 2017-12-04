package by.part1.homework;

public class HomeWork6 {

  //  Write a program which takes input integer array which contains positive and negative numbers
// and find out the average of positive and average of negative numbers.
// Example :
// 1.If user gives input 9,-1,-1,-4,1,5,-4,2,-3,1 then output will be :
//      Average of positive numbers: 3.6
//      Average of negative numbers: -2.6
// 2.If user gives input 12,4,-5,4,-7,-2,6,14,-8,10 then output will be
//      Average of positive numbers: 8.33
//      Average of negative numbers: -5.5

  public static void main(String[] args) {
    int[] arr1 = {9,-1,-1,-4,1,5,-4,2,-3,1};
    int[] arr2 = {12,4,-5,4,-7,-2,6,14,-8,10};

    printAvgPosAndNeg(arr1);
    printAvgPosAndNeg(arr2);
  }

  private static boolean printAvgPosAndNeg(int[] arr) {

    int sumPos = 0, sumNeg = 0, countPos = 0, countNeg = 0;

    for (int val : arr) {
      if (val > 0) {
        sumPos += val;
        countPos++;

      } else if (val < 0) {
        sumNeg += val;
        countNeg++;
      }
    }

    System.out.println(countPos == 0 ? "No positive numbers in array" : "Average of positive numbers: " + (float)sumPos / countPos);
    System.out.println(countNeg == 0 ? "No negative numbers in array" : "Average of negative numbers: " + (float)sumNeg / countNeg);

    return true;
  }
}
