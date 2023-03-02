import java.io.*;

class rectangle {
  int length;
  int breadth;
  int width;

  rectangle(int l, int b) {
    length = l;
    breadth = b;
  }

  void area() {
    int area = length * breadth;
    System.out.println("Area of Rectangle = " + area);
  }

  // constructor rectangle() overloading
  rectangle(int l, int b, int w) {
    length = l;
    breadth = b;
    width = w;
  }

  void cuboid() {
    int area = length * breadth * width;
    System.out.println("Area of Cuboid = " + area);
  }
}

public class constructorOverloading {
  public static void main(String[] args) {
    rectangle r1 = new rectangle(12, 23);
    rectangle r2 = new rectangle(12, 23, 34);
    r1.area();
    r2.cuboid();
  }
}