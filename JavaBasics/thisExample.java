/*
* this can be used to refer current class instance variable.
* this can be used to invoke current class method (implicitly)
* this() can be used to invoke current class constructor.
* this can be passed as an argument in the method call.
* this can be passed as argument in the constructor call.
* this can be used to return the current class instance from the method.*/

import java.io.*;

class student {
  String name;
  int id;
  static String uni_name = "OVGU";

  // this can be passed as argument in the constructor call.
  student(String name, int id) {
    this(); // this() can be used to invoke current class constructor.
    this.name = name;
    this.id = id;
  }

  student() {
    System.out.println("Invoke current class constructor.");
  }

  void getInfo() {
    System.out.println("Name = " + name + "ID = " + id + "University = " + uni_name);
  }

  // this can be used to invoke current class method (implicitly)
  void printDetails() {
    this.getInfo();
  }
}

public class thisExample {
  public static void main(String[] args) {
    student s1 = new student("Aishwarya", 111);
    student s2 = new student("Gaurav", 112);
    s1.getInfo();
    s1.printDetails();

    s2.getInfo();
    s2.printDetails();
  }
}