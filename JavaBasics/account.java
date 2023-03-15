import java.io.*;
import java.lang.*;

class account {
  private String name, email;
  private long acc_no;
  private float amt;

  public void setName(String name) {
    this.name = name;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getEmail() {
    return email;
  }

  public String getName() {
    return name;
  }

  public void setAcc_no(long acc_no) {
    this.acc_no = acc_no;
  }

  public long getAcc_no() {
    return acc_no;
  }

  public void setAmount(float amt) {
    this.amt = amt;
  }

  public float getAmount() {
    return amt;
  }
}