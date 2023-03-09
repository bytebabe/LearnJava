/* Usage of Java super Keyword
1. super can be used to refer immediate parent class instance variable.
2. super can be used to invoke immediate parent class method.
3. super() can be used to invoke immediate parent class constructor. */

import java.io.*; 
import java.lang.*; 

class Animal{
  String color = "White"; 
  Animal(){
    System.out.println("Animal class Constructor is called");
  }
  void eat(){
    System.out.println("Animal class eat method called");
  }
}
class Dog extends Animal{
  String color = "Black"; 
  Dog(){
    //super() can be used to invoke immediate parent class constructor.
    super(); 
    System.out.println("Dog class constructor is called "); 
  }
  void printColor(){
    System.out.println("Dog class color called "+color);
    //super can be used to refer immediate parent class instance variable.
    System.out.println("Animal Class color called "+super.color); 
  }
  void eat(){
    System.out.println("Dog class eat method called"); 
  }
  void methodcall(){
    //super can be used to invoke immediate parent class method.
    super.eat(); 
    printColor();
  }
}
public class superExample{
  public static void main(String[] args){
    Dog d = new Dog(); 
    d.methodcall();
    d.eat(); 
  }
}