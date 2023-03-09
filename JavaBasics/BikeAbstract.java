/*This program is  example of abstract class having abstract and non-abstract methods. 
Abstract class can have constructor, data members, methods(no body and body), even main()
*/

import java.io.*; 
import java.lang.*; 

abstract class bike{
  bike(){
    System.out.println("Bike created");
  }
  abstract void run(); 
  void changeGear(){
    System.out.println("Gear changed");
  }
}
class Honda extends bike{
  void run(){
    System.out.println("Honda is running"); 
  }
}
public class BikeAbstract{
  public static void main(String[] args){
    bike b = new Honda(); 
    b.run(); 
    b.changeGear();
  }
}
