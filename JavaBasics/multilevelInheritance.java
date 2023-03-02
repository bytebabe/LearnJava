import java.io.*;

class animal {
  void eat() {
    System.out.println("eating.. ");
  }
}

class dog extends animal {
  void bark() {
    System.out.println("barking.. ");
  }
}

class puppy extends dog {
  void weep() {
    System.out.println("weeping.. ");
  }
}

public class multilevelInheritance {
  public static void main(String[] args) {
    puppy p = new puppy();
    p.eat();
    p.bark();
    p.weep();
  }
}