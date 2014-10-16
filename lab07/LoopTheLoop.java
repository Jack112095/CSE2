////////////////////////////////////////////////////////////////////////////////
//Jack Fields
//Lab 07
//LoopTheLoop Program
//
//first compile the program
//javac LoopTheLoop.java
//run the program
//java LoopTheLoop

import java.util.Scanner;
public class LoopTheLoop {
    public static void main (String[ ] args){
        Scanner myScanner;
        myScanner = new Scanner ( System.in );


String a = "*";

System.out.println("Enter an integer between 1 and 15 -");
    double nStars = myScanner.nextDouble();
    int check = (int)nStars;
    
    if(check == nStars){
        nStars=0;
        while (nStars < 10){
            System.out.println(a);
        nStars++;
        a = a+ "*";
    }

    }
}
}
