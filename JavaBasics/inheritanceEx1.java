import java.io.*;

class employee {
  float salary = 1000;
}

class programmer extends employee {
  int bonus = 200;
}

public class inheritanceEx1 {
  public static void main(String[] args) {
    programmer i = new programmer();
    System.out.println("Salary = " + i.salary);
    System.out.println("bonus = " + i.bonus);
  }
}
