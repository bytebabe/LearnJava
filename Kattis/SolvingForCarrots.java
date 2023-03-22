import java.io.*; 
import java.util.Scanner; 

public class SolvingForCarrots{
  public static void main(String[] args){
    Scanner s = new Scanner(System.in); 
    int contest = s.nextInt(); 
    int won = s.nextInt(); 
    int carrots =0; 
    String arr[]  = new String[contest]; 
    for(int i=0; i<contest; i++){
      arr[i] = s.nextLine(); 
    }
      System.out.println(won); 
  }
}