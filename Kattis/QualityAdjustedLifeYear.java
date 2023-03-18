import java.util.Scanner;

public class QualityAdjustedLifeYear {
  public static void main(String[] args) {
    int N;
    Scanner s = new Scanner(System.in);
    N = s.nextInt();
    double QALY = 0.00;
    for (int i = 0; i < N; i++) {
      float qol = s.nextFloat();
      float year = s.nextFloat();
      QALY = QALY + (qol * year);
    }
    System.out.printf("%.3f", QALY);
  }
}