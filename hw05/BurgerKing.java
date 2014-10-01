////////////////////////////////////////////////////////////////////////////////
//Jack Fields
//HW05
//BurgerKing Program
//
// first compile the program
// javac BurgerKing.java
// run the program 
// java BurgerKing
// Now Burger King gets its chance. Write a program that prompts the user 
//to enter a choice of a burger, a soda, or fries. 
//Then the program prompts the users for details of their choices

import java.util.Scanner;
// define a program
public class BurgerKing {
    // main method needed for every Java program
    public static void main (String[] args) {
        Scanner myScanner;
        myScanner = new Scanner ( System.in );
        System.out.println("Enter a letter to indicate a choice of Burger (B or b) Soda (S or s) Fries (F or f)");
        String decision = myScanner.next(); 
        if(decision.equals("B") || decision.equals("b")){
            System.out.println("Enter A or a for all the fixins C or c for cheese N or n for none of the above");
            decision = myScanner.next(); 
        
            if(decision.equals("A") || decision.equals("a")){
            System.out.println("You ordered a burger with all the fixins");
            decision = myScanner.next(); }
            if(decision.equals("C") || decision.equals("c")){
            System.out.println("You ordered a burger with cheese");
            }
            if(decision.equals("N") || decision.equals("n")){
            System.out.println("You ordered a burger");
            }
            }
            if(decision.equals ("S") || decision.equals("s")){
            System.out.println("Do you want Pepsi (p or P),Coke (c or C), Sprite (s or S) or Mountain Dew (M or m)");
            decision = myScanner.next(); 
            if(decision.equals("P") || decision.equals("p")){
            System.out.println("You ordered a Pepsi");
            }
            if(decision.equals("C") || decision.equals("c")){
            System.out.println("You ordered a Coke");
            }
            if(decision.equals("S") || decision.equals("s")){
            System.out.println("You ordered a Sprite");
            }
            if(decision.equals("M") || decision.equals("m")){
            System.out.println("You ordered a Mountain Dew");
            }
            }
        if(decision.equals("F") || decision.equals("f")){
            System.out.println("Do you want a large or small order of fries");
            decision = myScanner.next(); 
            if(decision.equals("L") || decision.equals("l")){
            System.out.println("You ordered large fries");
            }
            if(decision.equals("S") || decision.equals("s")){
            System.out.println("You ordered small fries");
            }
            }
        else if(decision.equals("!B,!b,!F,!f,!s,!S")){
            System.out.println("Your order did not process. Try again.");
        }
    }
}

        
        