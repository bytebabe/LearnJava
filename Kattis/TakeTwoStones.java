import java.io.*;

public class TakeTwoStones {
  public static void main(String[] args) {
    int N = 6;
    if (N == 1) {
      System.out.println("Alice");
    } else {
      if (N % 2 == 0) {
        System.out.println("Bob");
      } else {
        System.out.println("Alice");
      }
    }
  }
}
