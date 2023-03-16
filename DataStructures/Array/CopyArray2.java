import java.io.*;
import java.lang.*;

class CopyArray2 {
  public static void main(String[] args) {
    int a[] = { 1, 2, 3, 4, 5 };
    int b[] = new int[5];

    System.out.println("Copying array from array a[] to array b[]");
    System.arraycopy(a, 0, b, 0, 5);
    for (int i = 0; i < a.length; i++) {
      System.out.print(b[i]);
    }
  }
}