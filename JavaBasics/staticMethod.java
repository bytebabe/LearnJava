//Program to demonstrate the use of a static method.  
//A static method can be invoked without the need for creating an instance of a class.
//A static method can access static data member and can change the value of it.

import java.io.*;

class student {
  int id;
  String name;
  static String uni_name = "OVGU";

  student(int i, String n) {
    id = i;
    name = n;
  }

  void printInfo() {
    System.out.println("Name = " + name + "\nID = " + id + "\n University = " + uni_name);
  }

  static void change() {
    uni_name = "ASAS";
  }
}

public class staticMethod {
  public static void main(String[] args) {
    student s1 = new student(101, "Aishwarya");
    student s2 = new student(102, "Gaurav");
    s1.printInfo();
    s2.printInfo();
    student.change(); // calling method without object creation
    s1.printInfo();
    s2.printInfo();
    student.uni_name = "TUM"; // access static data member and can change the value of it.
    s1.printInfo();
    s2.printInfo();
  }
}