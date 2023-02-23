import java.util.*;
import java.io.*;

public class example1 {
  public static void main(String[] args) {
    //Scanner scan = new Scanner(System.in);
    // System.out.print("Enter the city");
    //String city = scan.nextLine();
    //System.out.print(city);
    String city = "Berlin";
    if (city == "Berlin") {
      System.out.println("The city is Berlin");
    } 
    else if (city == "Magdeburg") {
      System.out.println("The city is Magdeburg");
    } 
    else {
      System.out.println("I don’t know the city");
    }
  }
}