
package com.example.names;

import java.util.Scanner;
public class AddressBuilder {
  public static void main(String[] args) {
    StringBuilder addresses = new StringBuilder();
    Scanner consoleInput = new Scanner(System.in);

    System.out.println("Please enter your Name: ");
    String fullName = consoleInput.nextLine().trim();

    addresses.append(fullName).append("\n").append("\n");
    addresses.append("Billing Address: \n");
    System.out.println("Please enter your Billing Address Street: ");
    String addressStreet = consoleInput.nextLine().trim();

    addresses.append(addressStreet).append("\n");
    System.out.println("Please enter your Billing Address City: ");
    String addressCity = consoleInput.nextLine().trim();

    addresses.append(addressCity).append(", ");
    System.out.println("Please enter your Billing Address State: ");
    String addressState = consoleInput.nextLine().trim();

    addresses.append(addressState).append(" ");
    System.out.println("Please enter your Billing Address Zip: ");
    String addressZip = consoleInput.nextLine().trim();
    addresses.append(addressZip).append("\n").append("\n");



    addresses.append("Shipping Address: \n");
    System.out.println("Please enter your Shipping Address Street: ");
    String addressStreet1 = consoleInput.nextLine().trim();
    addresses.append(addressStreet1).append("\n");
    System.out.println("Please enter your Shipping Address City: ");
    String addressCity1 = consoleInput.nextLine().trim();
    addresses.append(addressCity1).append(", ");
    System.out.println("Please enter your Shipping Address State: ");
    String addressState1 = consoleInput.nextLine().trim();
    addresses.append(addressState1).append(" ");
    System.out.println("Please enter your Shipping Address Zip: ");
    String addressZip1 = consoleInput.nextLine().trim();
    addresses.append(addressZip1);

    String fullAddresses = addresses.toString();
    System.out.println(fullAddresses);
  }
}
