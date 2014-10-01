////////////////////////////////////////////////////////////////////////////////
//Jack Fields
//Lab 05
//RandomGames java
//
// first compile the program
// javac RandomGames.java
// run the program
// java RandomGames

import java.util.Scanner;
// define a program
public class RandomGames {
    // main method needed for every Java program
    public static void main (String[] args) {
        Scanner myScanner;
        myScanner = new Scanner ( System.in );
        System.out.println("Enter R or r for Roulette, C or c for craps, P or p for pick a card -");
        String decision = myScanner.next();
        if(decision.equals("R") || decision.equals("r")){
            System.out.println()