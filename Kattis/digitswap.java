import java.util.Scanner; 

public class digitswap{
  public static void main(String[] agrs){
    Scanner s = new Scanner(System.in);  
    char[] a = s.next().toCharArray(); 
    for(int i =0; i<a.length-1; i++){
      char temp = a[i]; 
      a[i] = a[i+1]; 
      a[i+1] = temp; 
    }
    int num  = Integer.parseInt(new String(a)); 
    System.out.println(a); 
  }
}
