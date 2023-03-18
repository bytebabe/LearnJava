/*
1. Itterative way
2. Using Streams 
3. Sorting (a) and (b)
*/

import java.io.*; 
import java.util.*;
public class largestSmallest{
  static int arr[] = new int[]{1,2,3,4,5,6,7,8}; 
  //1. Itterative way
  static int largest(){
    int max = arr[0]; 
    for(int i =1; i<arr.length; i++){
      if(arr[i] > max){
        max = arr[i]; 
      }
    }
    return max; 
  }
  static int smallest(){
    int min = arr[0]; 
    for(int i =1; i<arr.length; i++){
      if(arr[i] < min){
        min = arr[i]; 
      }
    }
    return min; 
  }
  //3. sorting (a); 
  static int largestSort(){
    Arrays.sort(arr); 
    return arr[arr.length -1];
  }
  public static void main(String[] args){
    System.out.println("Largest element: "+largest()); 
    System.out.println("Smallest element: "+smallest()); 
    //2. using streams
    int max = Arrays.stream(arr).max().getAsInt(); 
    System.out.println("Getting max by stream :"+max); 

    System.out.println("Max by sorting (A): " +largestSort()); 
    //using sorting b
    int arr2[] = new int[]{2,3,4,5,7,8,9};
    Arrays.sort(arr2); 
    System.out.println("Max by sorting (B): "+arr2[arr2.length-1]);
  }
}