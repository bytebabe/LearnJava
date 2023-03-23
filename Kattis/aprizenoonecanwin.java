import java.util.*;

public class aprizenoonecanwin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] list1 = input.nextLine().split(" ");
        int N = Integer.parseInt(list1[0]);
        int X = Integer.parseInt(list1[1]);
        
        String[] list2Input = input.nextLine().split(" ");
        int[] list2 = new int[list2Input.length];
        for (int i = 0; i < list2Input.length; i++) {
            list2[i] = Integer.parseInt(list2Input[i]);
        }
        Arrays.sort(list2);

        int items = 1;
        for (int x = 0; x < N; x++) {
            int j = x + 1;
            for (int k = j; k < N; k++) {
                if (list2[x] + list2[k] <= X) {
                    items++;
                    break;
                }
                if (list2[x] + list2[j] > X) {
                    break;
                }
            }
        }
        System.out.println(items);
    }
}