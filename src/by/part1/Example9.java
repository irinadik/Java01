package by.part1; //необязательно

//в файле может быть только один public класс
//Названия классов начинаются с большой буквы
public class Example9 {

  public static void main(String args[]) {
    int x = 10;
// if ...
    if (x < 20) {
      System.out.print("Это оператор if");
    }

// if .. else ...
    if (x < 20) {
      System.out.print("Это оператор if");
    } else {
      System.out.print("Это оператор else");
    }

// if .. else if ... else ...
    if (x == 10) {
      System.out.print("Значение X = 10");
    } else if (x == 20) {
      System.out.print("Значение X = 20");
    } else if (x == 30) {
      System.out.print("Значение X = 30");
    } else {
      System.out.print("Это оператор else");
    }
    // combination
    int y = 10;

    if (x == 30) {
      if (y == 10) {
        System.out.print("X = 30 и Y = 10");
      }
    }
    // flatten

    if (x == 30 && y == 10) {
      System.out.print("X = 30 и Y = 10");
    }
  }
}
