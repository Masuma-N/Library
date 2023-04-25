package yearup.org.practicecode;
import java.util.Scanner;

class UltimateProjects {
    public static void main(String[] args){
    Scanner consoleInput=new Scanner(System.in);

    System.out.print("enter a number");
    float a= consoleInput.nextFloat();
    System.out.println("First number: "+a);

    System.out.println("Enter a number ");
    float b= consoleInput.nextFloat();
    System.out.println("second number: "+b);

    System.out.println("What operation would you like to do? ");
    String command= consoleInput.nextLine();
    System.out.println(command);

   float c= a+b;
   System.out.println("the answer is: "+c);
   System.out.println(command);








       /*
        if (operation == "+")
        {
            System.out.println("your answer is" + (num1 + num2));
        }
        else if  (operation == "-")
        {
            System.out.println("your answer is" + (num1 - num2));
        }

        else if (operation == "/")
        {
            System.out.println("your answer is" + (num1 / num2));
        }
       else if (operation == "*")
        {
            System.out.println("your answer is" + (num1 * num2));
        };

        */





    }

}
