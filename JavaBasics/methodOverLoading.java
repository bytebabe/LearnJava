/* Method Overloading can be done in two ways in Java. 
  1. By changing the data type 
  2. By changing the number of parameters
*/

import java.io.*;
import java.lang.*;

class perimeter {
  static int peri(int l, int w) {
    return 2 * (l + w);
  }

  // method overloading by chaning the data type
  // method overloading by changing the number of parameter
  static double peri(double l) {
    return (4 * l);
  }
}
public class methodOverLoading {
  public static void main(String[] args) {
    System.out.println(perimeter.peri(11, 23));
    System.out.println(perimeter.peri(25.6));
  }
}