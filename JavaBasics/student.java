import java.io.*;
import java.util.*;

class studentInfo {
  Scanner s = new Scanner(System.in);
  String name = s.nextLine();
  int id = s.nextInt();
}

public class student {
  public static void main(String[] args) {
    studentInfo s = new studentInfo();
    System.out.println("Name of the Student " + s.name);
    System.out.println("ID of the Student " + s.id);
  }
}