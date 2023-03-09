import java.io.*;
import java.lang.*;

abstract class shape {
  abstract void draw();
}

class Rectangle extends shape {
  void draw() {
    System.out.println("Rectangle class called");
  }
}

class Circle extends shape {
  void draw() {
    System.out.println("Circle class called");
  }
}

public class ShapeAbstarctEx {
  public static void main(String[] args) {
    shape s1 = new Rectangle();
    shape s2 = new Circle();
    s1.draw(); // Rectangle class draw() is called
    s2.draw(); // Circle class draw() iscalled
  }
}