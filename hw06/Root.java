////////////////////////////////////////////////////////////////////////////////
//Jack Fields
//HW06
//Root Program
//
// first compile the program
// javac Root.java
// run the program 
// java Root
//The bisection method is a very simple way to compute the square root of a number. Start by setting low to 0 and high to 1+x. Obviously the square root lies between low (whose square is less than the square root of x) and high (whose square is larger than the square root of x, which is not necessarily true, by the way, for high=x). Now take the middle of the interval [low, high] and call it middle. 
//If the square of middle is greater than x, then change high to middle; otherwise change low to middle. At this point the square root is still between low and high, but the distance between low and high has been halved. 
//Repeat this process until the difference between high and low is less than some small multiple of 1+x, say 0.0000001*(1+x). 
//Then the square root is very close to both low and high. For example, to find the square root of 2, start with [0,3] (0*0<2 and 3*3 > 2). 
//The middle is 1.5. 1.5*1.5=2.25>2, so the new interval is [0,2.25]. Now the middle is 1.125. 1.125*1.125<2, so the new interval is [1.125,2.25]. And so on. 
//Write a Java program that forces the user to enter a double that is greater than 0, uses the above algorithm to compute the square root of the number, and then prints it out. 
//Use 0.0000001 as the “tolerance” for stopping the loop that computes the square root. 

import java.util.Scanner;
// define a program
public class Root {
    // main method needed for every Java program
    public static void main (String[] args) {
        Scanner myScanner;
        myScanner = new Scanner ( System.in );
        double x = myScanner.nextDouble();
        
        System.out.println("Enter an integer - " +x);
        
        if(x < 0.0){
            System.out.println("This won't work. Try again.");
        }
        
        double low = 0.0;
        double high = 1.0 + x;
        double tolerance = 0.0000001;
        double middle = ((high + low) / 2); 
        
        while (high - low > tolerance * (1+x)){
            if (middle * middle > x){
            high = middle;
            }
            else{
            low = middle;
            }
        
            
        }
        System.out.println("The square root is" + middle);
        
    }
}
        
        
        
        