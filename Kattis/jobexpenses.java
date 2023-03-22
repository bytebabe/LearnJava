import java.util.Scanner; 

public class jobexpenses{
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    int N = s.nextInt(); 
    int arr[] = new int[N]; 
    int expense =0; 
    for(int i=0; i<N; i++){
      arr[i] = s.nextInt(); 
      if (arr[i] < 0) {
        expense += arr[i];
      }
    }
    System.out.println(Math.abs(expense));
  }
}