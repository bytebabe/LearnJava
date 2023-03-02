import java.io.*;

class student{
  String name; 
  int id;
  //creating parameterised construct
  student(String n, int i){
    name = n; 
    id =i;
  }
  void printDetails(){
    System.out.println("Name " +name+" ID "+id);
  }
}
public class parameterConstruct{
  public static void main(String[] args){
    student s1 = new student("Aishwarya", 111); 
    student s2 = new student("Gaurav", 112);
    s1.printDetails();
    s2.printDetails();
  }
}