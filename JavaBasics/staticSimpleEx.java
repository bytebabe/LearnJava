import java.io.*;

class counter {
  int count = 0;

  counter() {
    count++;
    System.out.println("Each time new count variable is created here " + count);
  }
}

class counter2 {
  static int count2 = 0;

  counter2() {
    count2++;
    System.out.println("Just one the count varible is created here " + count2);
  }
}

public class staticSimpleEx {
  public static void main(String[] args) {
    counter c = new counter();
    counter c1 = new counter();
    counter2 c2 = new counter2();
    counter2 c3 = new counter2();
  }
}