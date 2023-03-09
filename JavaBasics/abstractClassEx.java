import java.io.*; 
import java.lang.*; 

abstract class Bike{
  abstract void print();
}
public class abstractClassEx extends Bike{
  void print(){
    System.out.println("Bike class overridden");
  }
  public static void main(String[] args){
    Bike b = new abstractClassEx(); 
    b.print();
  }
}