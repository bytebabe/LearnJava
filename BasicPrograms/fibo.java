import java.io.*;
import java.util.*;

class fibo {
  public static void main(String args[]) {
    int a = 0, b = 1, sum, i, count = 10;
    // printing 0 and 1
    System.out.println(a + "\n" + b);
    // loop starts from 2 because 0 and 1 are already printed
    for (i = 2; i < count; ++i) {
      sum = a + b;
      System.out.println("" + sum);
      a = b;
      b = sum;
    }
  }
}
