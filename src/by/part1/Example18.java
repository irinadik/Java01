package by.part1; //необязательно

import java.util.Arrays;

//в файле может быть только один public класс
//Названия классов начинаются с большой буквы
public class Example18 {

  public static void main(String args[]) {
    double[] array1;         // Предпочтительный способ.
    double array2[];         //  Работает, но не является предпочтительным способом.

    //Создание массива
    array1 = new double[5];
    int size = 5;
    array2 = new double[size];

    //Заполнение массива
    array1[0] = 1;
    array1[1] = 2d;
    array1[2] = 3d;
    array1[3] = 4d;
    array1[4] = 5d;

    System.out.println(Arrays.toString(array1));
    //заполнение при объявлении

    double[] array3 = {1d, 2d, 3d, 4d, 5d};
    System.out.println(Arrays.toString(array3));

    //ошибка при выходе за рамки массива (ArrayIndexOutOfBoundsException)
    array2[5] = 6d;
  }
}
