package by.part1; //необязательно

//в файле может быть только один public класс
//Названия классов начинаются с большой буквы
public class Example20 {

  public static void main(String[] args) {
    double[] array1 = {1.9, 2.9, 3.4, 3.5};

    // Вывести массив на экран
    for (double element : array1) {
      System.out.println(element);
    }

    // Массив array2 из 5 элементов типа double.
    double[] array2 = {2.4, 3.8, 11.2, 9.8, 1.18};
    // Вывод длины массива array2 на экран.
    System.out.println("Количество элементов в массиве array2: " + array2.length);

    // Массив array3 из 4 элементов типа String.
    String[] array3 = {"Java", "массив", "пример", "proglang.su"};
    // Вывод размера массива array3 на экран.
    System.out.println("Количество элементов в массиве array3: " + array3.length);
  }
}
