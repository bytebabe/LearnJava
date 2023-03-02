//Aggregation Example

import java.io.*;

public class emp {
  int id;
  String name;
  address ad;

  emp(String name, int id, address ad) {
    this.name = name;
    this.id = id;
    this.ad = ad;
  }

  public void display() {
    System.out.println("Name =  " + name + "\n ID = " + id);
    System.out.println(
        "City = " + ad.city + "\n State = " + ad.state + "\n Country = " + ad.country + "\n Zipcode = " + ad.zipcode);
  }

  public static void main(String[] args) {
    address a = new address("Berlin", "Saxony-Anhalt", "Germany", 12345);
    address a2 = new address("Magdeburg", "Saxony-Anhalt", "Germany", 23456);

    emp e1 = new emp("Aishwarya", 111, a);
    emp e2 = new emp("Gaurav", 112, a2);

    e1.display();
    e2.display();
  }
}
