////////////////////////////////////////////////////////////////////////////////
//Jack Fields
//HW 03
// Root Program
//
// first compile the program
// javac Root.java
// run the program
// java Root//
    import java.util.Scanner;
// define a class
public class Root {
    // method required for all programs
    public static void main (String [ ] args) {
        Scanner myScanner;
        myScanner = new Scanner ( System.in );
        System.out.println("Enter a double, and I print its cube root:");
        int x=myScanner.nextInt( );
        int guess=x/3;
        double guess1=(guess*guess*guess+x)/(3*guess*guess); 
        double guess2=(2*guess1*guess1*guess1+x)/(3*guess1*guess1);
        double guess3=(2*guess2*guess2*guess2+x)/(3*guess2*guess2);
        double guess4=(2*guess3*guess3*guess3+x)/(3*guess3*guess3);
        double guess5=(2*guess3*guess3*guess3+x)/(3*guess3*guess3);
        System.out.println("crude guess" +guess5);
        
        
        
    } //end of method
} //end of class 