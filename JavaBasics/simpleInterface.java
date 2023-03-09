import java.io.*;
import java.lang.*;

interface Drawable {
  void draw();
}

class Rectangle implements Drawable {
  public void draw() {
    System.out.println("Rectangle Drawing");
  }
}

class Circle implements Drawable {
  public void draw() {
    System.out.println("Circle Drawing");
  }
}

class simpleInterface {
  public static void main(String[] args) {
    Drawable d = new Circle();
    d.draw();
  }
}