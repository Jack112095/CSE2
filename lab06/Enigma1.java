////////////////////////////////////////////////////////////////////////////////
//Jack Fields
//Lab06
// Enigma1 Program
//
//first compile the program
//javac Enigma1.java
//run the program
//java Enigma1

import java.util.Scanner;
public class Enigma1{
  public static void main(String []arg){
    double percent;
    System.out.print("Enter a value for the percent (0, 1,...99)- ");
    double x=((new Scanner(System.in)).nextDouble());
    if(x < 0){
    System.out.println("That number doesn't work. Try again");
    }
   System.out.println("You entered "+x+"%");
  double remainder = (1-x/100);
  System.out.println("The proportion remaining is " + remainder);
   
   }
}

//Error report: To make it much easier for all numbers, just
// create a double output that would allow any integer to be entered
// and to show the percentage and proportion remaining