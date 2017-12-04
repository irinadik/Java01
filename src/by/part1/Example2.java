package by.part1;

public class Example2 {

  public static void main(String[] args) {
    double a = 1.1d;
    float b = 2.2f;
    long c = 3;
    int d = 4;
    byte e = 5;
    //
    double x1 = a + b + c + d + e;
    System.out.println(x1);
    float x2 = b + c + d + e;
    System.out.println(x2);
    long x3 = c + d + e;
    System.out.println(x3);
    int x4 = d + e;
    System.out.println(x4);

    int y1 = (int) (a + b + c + d + e);
    System.out.println(y1);
    double y2 = b + c + d + e;
    System.out.println(y2);
    int y3 = (byte) (c + d + e);
    System.out.println(y3);
    byte y4 = (byte) (d + e);
    System.out.println(y4);
  }
}
