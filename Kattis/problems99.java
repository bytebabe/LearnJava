import java.util.Scanner; 
import java.lang.Math; 

public class problems99{
  public static void main(String[] args){
    Scanner s = new Scanner(System.in); 
    int N = s.nextInt(); 
    if(N < 100){
      System.out.println(99); 
    }
    else{
      N += 1.1;
      System.out.println((Math.round(N/100)*100)-1);
    }
  }
}