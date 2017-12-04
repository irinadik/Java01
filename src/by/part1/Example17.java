package by.part1; //необязательно

//в файле может быть только один public класс
//Названия классов начинаются с большой буквы
public class Example17 {

  public static void main(String args[]) {
    int[] numbers = {10, 20, 30, 40, 50};

    for (int x : numbers) {
      if (x == 30) {
        break;
      }
      System.out.print(x);
      System.out.print("\n");
    }
    for (int x : numbers) {
      if (x == 30) {
        continue;
      }
      System.out.print(x);
      System.out.print("\n");
    }
  }
}
