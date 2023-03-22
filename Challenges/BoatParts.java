import java.io.*; 
import java.util.*; 

public class BoatParts{
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
      int parts = s.nextInt(); 
      int days = s.nextInt(); 
      int count = 1;
      String arr[] = new String[days];
      for(int i=0; i<days; i++){
        arr[i] = s.nextLine(); 
      }
    Set<String> set = new HashSet<>();
    for(int i=0;i<days;i++){
            set.add(arr[i]);
            if(set.size()==parts) break;
            count++;
        }
      if(count == days+1){
        System.out.println("paradox avoided");
      }
    else{
      System.out.println(count);
    }
  }
}