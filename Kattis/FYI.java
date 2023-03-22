import java.util.Scanner;

public class FYI {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String num = s.nextLine();
        if(num.charAt(0) == '5' && num.charAt(1) == '5' && num.charAt(2) == '5') {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}