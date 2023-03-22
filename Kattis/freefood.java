import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class freefood {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        Set<Integer> days = new HashSet<>();
        for (int i = 0; i < N; i++) {
            int dayA = s.nextInt();
            int dayB = s.nextInt();
            for (int j = dayA; j <= dayB; j++) {
                days.add(j);
            }
        }
        System.out.println(days.size());
    }
}
