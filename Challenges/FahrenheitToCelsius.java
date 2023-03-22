import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        sc.close();

        String[] fahrenheit = input.split("/");

        int a = Integer.parseInt(fahrenheit[0]);
        int b = Integer.parseInt(fahrenheit[1]);

        int c = (int) Math.round((5 * a - 32 * 5 *b) / 9.0 * b);
        int gcd = gcd(c, b);

        System.out.println(c / gcd + "/" + b / gcd);
    }

    private static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
