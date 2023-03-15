
//passing array as method parameter
import java.io.*;
import java.lang.*;

class ArrayInParameter {
  static void min(int arr[]) {
    int min = arr[0];
    for (int i = 1; i < arr.length; i++) {
      if (min < arr[i]) {
        min = arr[i];
      }
      System.out.println(min);
    }
  }

  // passing anonymous array
  static void print(int brr[]) {
    for (int j = 0; j < brr.length; j++) {
      System.out.println("Anonymus Array " + j);
    }
  }
}

public class array2 {
  public static void main(String[] args) {
    int a[] = { 32, 23, 54, 67 };
    ArrayInParameter.min(a);
    ArrayInParameter.print(new int[] { 2, 4, 6, 8 });
  }
}