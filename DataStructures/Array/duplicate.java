import java.io.*;
import java.util.*;

public class duplicate {
  public static void main(String[] args) {
    int arr[] = new int[] { 2, 3, 4, 5, 6, 7, 3, 4, 5, 6 };

    // bruteforce approch
    System.out.println("Duplicate through bruteforce");
    for (int i = 0; i < arr.length; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[i] == arr[j]) {
          System.out.print(arr[i] + " ");
        }
      }
    }
    System.out.println();
    // using hashSet
    Set<Integer> unique = new HashSet<>();
    Set<Integer> dups = new HashSet<>();
    for (int i : arr) {
      if (!unique.add(i)) {
        dups.add(i);
      }
    }
    System.out.println("Dupplicates through HashSet");
    System.out.print(dups);
  }
}