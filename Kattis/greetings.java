import java.util.Scanner; 

public class greetings{
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    int count=0;
    String str = s.nextLine(); 
    StringBuilder sb = new StringBuilder(str); 
    for(int i=0; i < str.length(); i++){
      if(str.charAt(i) == 'e'){
        count ++;
      }
    }
    if(count > 0){
      for(int j=1; j<=count; j++){
      sb.insert(1,'e');
    }
    }
    System.out.println(sb); 
  }
}