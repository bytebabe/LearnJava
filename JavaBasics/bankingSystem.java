import java.io.*;
import java.util.*;

class account{
  String name; 
  int acc_no=0; 
  double bal=0;
  Scanner s = new Scanner(System.in);
  
  void getInfo(String n, int a, double b){
    name = n;
    acc_no = a;
    bal = b;
  }
  void deposit(double amt){
    bal = bal + amt;
    System.out.println("Current Balance: "+bal);
  }
  void withdrawl(double amt){
    if(amt > bal){
      System.out.println("Insufficient balance.\n You current balance "+bal);
    }
    else{
      System.out.println("Please collect your money.\n Your balance after withdrawal "+(bal-amt));
    }
  }
  void checkBal(int a){
    if(a == acc_no){
      System.out.println("Your balance " + bal);
    }
    else{
      System.out.println("Please enter correct account number");
    }
  }
  void getAccDetails(int a){
    if(a == acc_no){
      System.out.println("Your account details \n Account number " +acc_no+"\n Current Balance "+bal+"\n Name " +name);
    }
    else{
      System.out.println("Please enter correct account number");
    }
  }
}
public class bankingSystem{
  public static void main(String[] args){
    account a1 = new account();
    a1.getInfo("Aishwarya",12345,1000000);
    a1.getAccDetails(12345);
    a1.deposit(2500);
    a1.checkBal(12345);
    a1.withdrawl(100);
    a1.checkBal(12345);
  }
}