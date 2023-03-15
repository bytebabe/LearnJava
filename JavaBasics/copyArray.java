import java.io.*;
import java.lang.*;

class copyArray {
  public static void main(String[] args) {
    // declaring source array
    char copyFrom[] = { 'd', 'e', 'c', 'a', 'f', 'f', 'e', 'i', 'n', 'a', 't', 'e', 'd' };
    //declaring destination array
    char copyTo[] = new char[7]; 
    //Copying array from copyFrom to copyTo
    System.arraycopy(copyFrom, 2, copyTo, 0, 7);
    System.out.println(String.valueOf(copyTo)); 
  }
}