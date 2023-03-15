import java.io.*;
import java.lang.*;

class jaggedArray {
  public static void main(String[] args) {
    int arr[][];
    arr = new int[3][];
    arr[0] = new int[3];
    arr[1] = new int[4];
    arr[2] = new int[2];

    int count = 0;
    for (int i = 0; i < arr.length; i++)
      for (int j = 0; j < arr[i].length; j++)
        arr[i][j] = ++count;

    System.out.println("Printing Jagged Array");
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        System.out.print(arr[i][j] + " ");
      }
      System.out.println();
    }
  }
}