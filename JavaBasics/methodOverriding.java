import java.io.*;
import java.lang.*;

class vehicle {
  void run() {
    System.out.println("Vehicle is called");
  }
}

class methodOverriding extends vehicle{ 
  void run() { 
    System.out.println("Bike is called");
  }

  public static void main(String[] args){
    methodOverriding b = new methodOverriding(); 
    b.run();
  }
}