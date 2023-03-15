import java.io.*;
import java.lang.*;

public class matrixMultiplication {
  public static void main(String[] args) {
    int a[][] = { { 1, 2, 3 }, { 3, 4, 5 } };
    int b[][] = { { 4, 5, 6 }, { 7, 6, 9 } };

    int prod[][] = new int[2][3];
    for (int i = 0; i < 2; i++) {
      for (int j = 0; j < 2; j++) {
        prod[i][j] = 0;
        for (int k = 0; k < 2; k++) {
          prod[i][j] += a[i][k] * b[k][j];
        }
        System.out.print(prod[i][j] + " ");
      }
      System.out.println();
    }
  }
}