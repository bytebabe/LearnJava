import java.io.*;
import java.lang.*;
import java.util.*;

class CopyArray {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter elements for first array ");
    int arr[] = new int[10];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = scan.nextInt();
    }
    System.out.println("Copying elements for next array");
    int brr[] = new int[10];
    for (int j = 0; j < arr.length; j++) {
      brr[j] = arr[j];
    }
    System.out.println("Elements of First array ");
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i]);
    }
    System.out.println();
    System.out.println("Elements of Second array ");
    for (int i = 0; i < brr.length; i++) {
      System.out.print(brr[i]);
    }
    System.out.println();
  }
}