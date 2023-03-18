import java.io.*;
import java.util.Scanner;

public class metronome{
    public static void main (String[]args){
      Scanner s = new Scanner(System.in);
      double milo = s.nextFloat();
      double val = milo/4;
        System.out.printf("%.2f",val);
    }
}