package by.part1; //необязательно

//в файле может быть только один public класс
//Названия классов начинаются с большой буквы
public class Example7 {

  public static void main(String args[]) {
    boolean a = true;
    boolean b = false;

    System.out.println("a && b = " + (a && b));

    System.out.println("a || b = " + (a || b));

    System.out.println("!(a && b) = " + !(a && b));
  }
}
