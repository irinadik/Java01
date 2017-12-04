package by.part1; //необязательно

import java.util.Arrays;

//в файле может быть только один public класс
//Названия классов начинаются с большой буквы
public class Example19 {

  public static void main(String[] args) {
    double[] array = {1.9, 2.9, 3.4, 3.5};

    // Вывести на экран все элементы массива
    for (int i = 0; i < array.length; i++) {
      System.out.println(array[i] + " ");
    }
    // Сумма элементов массива
    double total = 0;
    for (int i = 0; i < array.length; i++) {
      total += array[i];
    }
    System.out.println("Сумма чисел массива: " + total);
    // Нахождение среди элементов массива наибольшего
    double max = array[0];
    for (int i = 1; i < array.length; i++) {
      if (array[i] > max) {
        max = array[i];
      }
    }
    System.out.println("Наибольший элемент: " + max);
  }
}
