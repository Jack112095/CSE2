////////////////////////////////////////////////////////////////////////////////
//Jack Fields
//HW05
//BoolaBoola Program
//
// first compile the program
// javac BoolaBoola.java
// run the program
// java BoolaBoola
//Write a program that has three boolean variables to each of which the value of true or false is randomly assigned. 
//Then, at random, combine the three variables with random choices of && and || and stores the result. For example, one might have the expression true && false || true (there are 32 possible expressions, 
//so I will not list all the possibilities). The program should then present the expression to the user and ask the user to state the result of of the expression.

import java.util.Scanner;
// define a program
public class BoolaBoola {
    // main method needed for every Java program
    public static void main (String[] args) {
        Scanner myScanner;
        System.out.print("Enter an integer:");
        myScanner = new Scanner ( System.in );
        int randomnum = ((int)(Math.random(4) + 1));
        double random1 = Math.random();
        boolean num1 = random1 < 0.5;
        double random2 = Math.random();
        boolean num2 = random2 < 0.5;
        double random3 = Math.random();
        boolean num3 = random3 < 0.5;
        boolean random4;
        String input;

        
        switch(randomnum){
            case 1: System.out.println("Does" + num1 + "||" + num2 + "&&" + num3 + "have the value true (t/T) or false(f/F)?"); 
            input = myScanner.next();
            if (input.equalsIgnoreCase("t"))
            random4=true;
            else
            random4=false;
            if (random4 ==  (num1||num2&&num3))
            System.out.println("Correct");
            else
            System.out.println("Wrong");
            break;
             
            case 2: System.out.println("Does" + num1 + "&&" + num2 + "&&" + num3 + "have the value true (t/T) or false(f/F)?" 
            input = myScanner.next();
            if (input.equalsIgnoreCase("t"))
            random4=true;
            else
            random4=false;
            if (random4 ==  (num1&&num2&&num3))
            System.out.println("Correct");
            else
            System.out.println("Wrong");
            break;
            
            case 3: System.out.println("Does" + num1 + "||" + num2 + "||" + num3 + "have the value true (t/T) or false(f/F)?" 
            input = myScanner.next();
            if (input.equalsIgnoreCase("t"))
            random4=true;
            else
            random4=false;
            if (random4 ==  (num1||num2||num3))
            System.out.println("Correct");
            else
            System.out.println("Wrong");
            break;
            
            case 4: System.out.println("Does" + num1 + "&&" + num2 + "||" + num3 + "have the value true (t/T) or false(f/F)?" 
            input = myScanner.next();
            if (input.equalsIgnoreCase("t"))
            random4=true;
            else
            random4=false;
            if (random4 ==  (num1&&num2||num3))
            System.out.println("Correct");
            else
            System.out.println("Wrong");
            
        }
    }
}
        
        
        
       
        
        
