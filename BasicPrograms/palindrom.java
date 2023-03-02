import java.io.*;
import java.util.*;

public class palindrom {
  public static void main(String[] args) {
    int num;
    int temp = 0, r = 0, sum = 0;
    Scanner s = new Scanner(System.in);
    System.out.println("Enter a number");
    num = s.nextInt();
    temp = num;

    while (num > 0) {
      r = num % 10;
      sum = (sum * 10) + r;
      num = num / 10;
    }
    if (temp == sum) {
      System.out.println(temp + " is a palindrom");
    } else {
      System.out.println(temp + " is not a plaindrom");
    }
  }
}