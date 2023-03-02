import java.io.*;
import java.util.*;

public class prime {
  public static void main(String[] args) {
    int num, m = 0, flag = 0, i;
    Scanner s = new Scanner(System.in);
    System.out.println("Enter a number");
    num = s.nextInt();
    m = num / 2;
    // checking number is 0 or 1
    if (num == 0 || num == 1) {
      System.out.println(num + " is not a prime number");
    } else {
      for (i = 2; i <= m; i++) {
        if (num % i == 0) {
          System.out.println(num + " is not a prime");
          flag = 1;
          break;
        }
      }
      if (flag == 0) {
        System.out.println(num + " is a prime number");
      }
    }
  }
}clear