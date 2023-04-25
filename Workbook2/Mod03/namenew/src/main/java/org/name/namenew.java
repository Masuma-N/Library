package org.name;

import java.util.Scanner;


public class namenew {
    public static void main(String[] args) {
        Scanner consoleInput = new Scanner(System.in);
        System.out.print("what is your name?");
        String name = consoleInput.nextLine().trim();
        String[] fullName = name.split(" ");
        String firstName = fullName[0];
        if (fullName.length > 2) {
            System.out.println("first name: " + fullName[0]);
            System.out.println("middle name: " + fullName[1]);
            System.out.println("last name: " + fullName[2]);

        } else {
            System.out.println("first name: " + fullName[0]);
            System.out.println("middle name: none ");
            System.out.println("last name: " + fullName[1]);

        }
    }
}