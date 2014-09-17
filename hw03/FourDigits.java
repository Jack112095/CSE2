////////////////////////////////////////////////////////////////////////////////
//Jack Fields
//HW03
//FourDigits Program
// first compile the program
// javac FourDigits.java
// run the program
// java FourDigits//
//
    import java.util.Scanner;
    // define a program
    public class FourDigits {
    // main method needed for every Java program
    public static void main (String [ ] args) {
        Scanner myScanner;
        myScanner = new Scanner ( System.in );
        System.out.println("Enter a double and I display the four digits to the right of the decimal point-: ");
        double number=myScanner.nextDouble( ); // 
        int number1=((int)(number*10000)%10000);
        System.out.println("The four digits are" +number1);
    } //end of method
} //end of main class