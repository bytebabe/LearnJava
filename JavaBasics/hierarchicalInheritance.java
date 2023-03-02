import java.io.*;

class animal {
  void eat() {
    System.out.println("eating..");
  }
}

class dog extends animal {
  void bark() {
    System.out.println("barking..");
  }
}

class cat extends animal {
  void meow() {
    System.out.println("meowing..");
  }
}

public class hierarchicalInheritance {
  public static void main(String[] args) {
    dog d = new dog();
    cat c = new cat();
    d.eat();
    d.bark();
    c.eat();
    c.meow();
    // the following gives compile time error
    // d.meow();
    // c.bark();
  }
}