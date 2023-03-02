//this program is about object initialisation through methods

import java.io.*;

class studentInfo {
  String name;
  int id;

  void getInfo(String n, int i) {
    name = n;
    id = i;
  }

  void printInfo() {
    System.out.println("Name = " + name);
    System.out.println("ID = " + id);
  }
}

public class student3 {
  public static void main(String[] args) {
    studentInfo s = new studentInfo();
    s.getInfo("Java", 1);
    s.printInfo();
    s.getInfo("Narayana", 2);
    s.printInfo();
  }
}
