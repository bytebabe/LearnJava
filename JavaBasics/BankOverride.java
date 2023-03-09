import java.io.*;
import java.lang.*;

class bank {
  int getInterestRate() {
    return 0;
  }
}

class SBI extends bank {
  int getInterestRate() {
    return 8;
  }
}

class ICICI extends bank {
  int getInterestRate() {
    return 9;
  }
}

class Axis extends bank {
  int getInterestRate() {
    return 7;
  }
}

public class BankOverrid e{
  public static void main(String[] args){
    SBI s = new SBI(); 
    ICICI i = new ICICI(); 
    Axis a = new Axis();

    System.out.println("Interest Rate in SBI = "+s.getInterestRate());
    System.out.println("Interest Rate in ICICI = "+i.getInterestRate());
    System.out.println("Interest Rate in Axis = "+a.getInterestRate());
  }
}