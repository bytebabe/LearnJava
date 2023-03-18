import java.io.*;

public class oddPosition {
  public static void main(String[] args) {
    int arr[] = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
    System.out.println("Printing elements from odd index");
    for (int i = 0; i < arr.length; i++) {
      if (i % 2 == 0) {
        System.out.print(arr[i] + " ");
      }
    }
    System.out.println();
    System.out.println("Printng even elements");
    for (int i = 0; i < arr.length; i++) {
      if (i % 2 != 0) {
        System.out.print(arr[i] + " ");
      }
    }
    System.out.println();
  }
}