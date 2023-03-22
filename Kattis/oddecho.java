import java.util.Scanner;

public class oddecho{
  public static void main(String[] args){
    Scanner s = new Scanner(System.in); 
    int N = s.nextInt(); 
    s.nextLine();
    String arr[] = new String[N]; 
    for(int i = 0; i<N; i++){
      arr[i] = s.nextLine(); 
    }
    System.out.println(); 
    for(int j=0; j < arr.length; j++){
      if(j%2 ==0){
        System.out.println(arr[j]);
      }
    }
  }
}