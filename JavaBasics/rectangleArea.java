import java.io.*;

class area {
  float len;
  float breadth;

  void getinfo(float l, float b) {
    len = l;
    breadth = b;
  }

  void printarea() {
    System.out.println("Area of rectangle = " + (len * breadth));
  }
}

public class rectangleArea {
  public static void main(String[] args) {
    area a1 = new area();
    area a2 = new area();
    a1.getinfo(11, 24);
    a2.getinfo(4, 5);
    a1.printarea();
    a2.printarea();

  }
}