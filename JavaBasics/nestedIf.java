import java.io.*;
import java.util.*;

class nestedIf {
  public static void main(String args[]) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter state");
    String state = scan.nextLine();
    System.out.println(state);
    System.out.println("Enter Country");
    String country = scan.nextLine();
    System.out.println(country);

    if (country == "India") {
      if (state.startsWith("KA")) {
        System.out.println("You are in Karnatak");
      } else if (state.startsWith("T")) {
        System.out.println("You are in Tamil Nadu");
      }
    } else {
      System.out.println("May be you are somewhere else");
    }
  }
}