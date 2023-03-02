
//this program gives the example of object initialisation by reference
import java.io.*;

class studentInfo {
  String name;
  int id;
}

public class student2 {
  public static void main(String[] args) {
    // creating single object
    studentInfo s = new studentInfo();
    s.id = 111;
    s.name = "Aishwarya Suresh";
    System.out.println("Object s.\n Name = " + s.name + " \n and ID =  " + s.id);
    // creating multiple objects to store information through reference variable.
    studentInfo s1 = new studentInfo();
    studentInfo s2 = new studentInfo();
    s1.name = "Gaurav";
    s2.id = 121;
    System.out.println("Object s1.\n Name = " + s1.name);
    System.out.println("Object s2.\n ID = " + s1.id);
  }
}