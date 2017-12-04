package by.part1; //необязательно

//в файле может быть только один public класс
//Названия классов начинаются с большой буквы
public class Example22 {

  public static void main(String[] args) {
    double d;

    d = -5.5;
    double dAbs = Math.abs(d); //равно 5.5

    System.out.println("возвращает абсолютное значение (модуль) " + dAbs);
    System.out.println();

    double acos = Math.acos(1);
    System.out.println("возвращает арккосинус значения " + acos);
    System.out.println();

    d = 27;
    double cbrt = Math.cbrt(d); //равен 3.0

    System.out.println("возвращает кубический корень  " + cbrt);
    System.out.println();

    d = 27.1;
    double ceil = Math.ceil(d); //равен 28.0

    System.out.println("возвращает наименьшее целое число  " + ceil);
    System.out.println();

    d = 9.9;
    double floor = Math.floor(d); //равен 9.0
    System.out.println("возвращает наибольшее целое число  " + floor);
    System.out.println();


    double d1 = 5.0;
    double d2 = 3.0;
    double max = Math.max(d1, d2); //равен 5.0
    System.out.println("возвращает больший из аргументов  " + max);
    System.out.println();

  }
}
