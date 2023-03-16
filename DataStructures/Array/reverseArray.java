import java.io.*;
import java.util.*;

public class reverseArray {
  public static void main(String[] args) {
    int arr[] = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
    System.out.println("Orginal Array ");
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println("\n");
    // using simple reversal of array
    System.out.println("Using loop from the end of array");
    for (int i = arr.length-1; i >= 0; i--) {
      System.out.print(arr[i] + " ");
    }
    System.out.println("\n");
    // using Arraylist to reverse the array
    System.out.println("Using Arraylist to reverse the array");
    Collections.reverse(Arrays.asList(arr));
    System.out.print(arr);
    System.out.println("\n");
    // using inplace reversal of array
    System.out.println("Using inplace reverse of the array");
    int temp;
    for (int i = 0; i < arr.length/2; i++) {
      temp = arr[i];
      arr[i] = arr[arr.length - i - 1];
      arr[arr.length - i - 1] = temp;
    }
    for(int i =0; i<arr.length; i++){
      System.out.print(arr[i]); 
    }
    System.out.println("\n");
  }
}