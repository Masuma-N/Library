package org.name;

import java.util.Scanner;

public class name {
    public static void main(String[] args) {
      Scanner nameInput=new Scanner(System.in);

        System.out.println("enter your first name");
        String firstname= nameInput.next();

        System.out.println("enter your middle name");
        String middlename= nameInput.next();
        if (middlename.equals("na")){
            middlename= "";
        }

        System.out.println("enter your last name");
        String lastname= nameInput.next();

        System.out.println("enter your suffix name");
        String suffname= nameInput.next();

        if(middlename.equals("")) {
            System.out.println(suffname+"."+firstname+" "+middlename+ lastname);
        }
        else{
            System.out.println(suffname+"."+firstname+" "+middlename+ lastname);
        }





    }

}
