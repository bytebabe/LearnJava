import java.io.*;
import java.lang.*;

public class account_test {
  public static void main(String[] args) {
    account acc = new account();
    acc.setName("Aishwarya");
    acc.setEmail("aishwarya3939@gmail.com");
    acc.setAcc_no(123456910);
    acc.setAmount(336.87f);

    System.out.println("Name: " + acc.getName());
    System.out.println("Email: " + acc.getEmail());
    System.out.println("Account No: " + acc.getAcc_no());
    System.out.println("Amount: " + acc.getAmount());
  }
}