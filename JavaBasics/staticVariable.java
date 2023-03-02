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
}

public class staticVariable {
  public static void main(String[] args) {
    student s1 = new student(101, "Aishwarya");
    student s2 = new student(102, "Gaurav");
    s1.printInfo();
    s2.printInfo();
    // chaning the static variable value
    s1.uni_name = "TUM";
    s1.printInfo();
  }
}