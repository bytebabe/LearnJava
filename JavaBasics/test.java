interface Printable {
  void print();
}

interface Showable {
  void show();
}

class test implements Printable, Showable {
  public void print() {
    System.out.println("Hello");
  }

  public void show() {
    System.out.println("Welcome");
  }

  public static void main(String args[]) {
    test obj = new test();
    obj.print();
    obj.show();
  }
}