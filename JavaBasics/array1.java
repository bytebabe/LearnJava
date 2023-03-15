import java.io.*;
import java.lang.*;

class array1 {
  public static void main(String[] args) {
    int[] a;
    a = new int[10];
    int b[] = { 9, 8, 7, 6, 5, 4 }; // declaration, instantiation and initialization
    for (int i = 0; i <= a.length; i++) {
      System.out.println("Array a " + i);
    }
    System.out.println("************************************");
    // using for-each loop
    for (int j : b) {
      System.out.println("Array b " + j);
    }
  }
}
