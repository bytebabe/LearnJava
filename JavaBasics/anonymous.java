//this program is about anonymous object creation 
//and creating mutiple objects of one type

import java.io.*;

class facto {
  void calc(int n) {
    int fact = 1;
    for (int i = 1; i <= n; i++) {
      fact = fact * i;
    }
    System.out.println("Factorial of " + n + " is " + fact);
  }
}

public class anonymous {
  public static void main(String[] args) {
    new facto().calc(5); //anonymous object
//mutiple obj of same type
    facto f1 = new facto(),f2=new facto();
    f1.calc(4);
    f2.calc(6);
  }
}