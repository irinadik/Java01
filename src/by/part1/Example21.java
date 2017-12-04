package by.part1; //необязательно

//в файле может быть только один public класс
//Названия классов начинаются с большой буквы
public class Example21 {

  public static void main(String[] args) {
    char[] array = {'П', 'р', 'и', 'в', 'е', 'т', '.'};
    String hello = new String(array);
    System.out.println(hello);

    //Длина строки
    int len = hello.length();
    System.out.println("Длина строки: " + len + " символ.");
    System.out.println();

    //Объединение
    String string1 = "world ";
    System.out.println("Hello, ".concat(string1).concat("!"));
    System.out.println("Hello, " + string1 + "!");
    System.out.println();

    //charAt
    String s = "Hello, " + string1 + "!";
    char result1 = s.charAt(8);
    char result2 = s.charAt(11);
    System.out.println("Восьмой символ строки - " + result1);
    System.out.println("Одиннадцатый символ строки - " + result2);
    System.out.println();

    //compareTo && compareToIgnoreCase

    String str1 = "Hello, world !";
    String str2 = "Hello, world !";
    String str3 = "Hello, world";

    int result = str1.compareTo(str2);
    System.out.println(result);

    result = str2.compareTo(str3);
    System.out.println(result);

    result = str3.compareTo(str1);
    System.out.println(result);
    System.out.println();

    //length
    System.out.print("Длина строки \"" + str1 + "\" - ");
    System.out.println(str1.length());
    System.out.println();

    //replace && replaceAll
    System.out.println("replace = " + str1.replace('l', 'X'));
    System.out.println("replaceAll = " + str1.replaceAll("l", "X"));
    System.out.println();
    //split
    for (String retval : str1.split(" ")) {
      System.out.println("split with: " + retval);
    }
    System.out.println();
    for (String retval : str1.split(" ", 2)) {
      System.out.println("split with limit [2]: " + retval);
    }
    System.out.println();
  }
}
