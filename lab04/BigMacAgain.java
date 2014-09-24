////////////////////////////////////////////////////////////////////////////////
//Jack Fields
//Lab 04
//BigMacAgain Program
//
// first compile the program
// javac BigMacAgain.java
// run the program
// java BigMacAgain//

    import java.util.Scanner;
    // define a class
    public class BigMacAgain {
    // main method needed for all Java programs
    public static void main (String[ ] args) {
        Scanner myScanner;
        myScanner = new Scanner ( System.in );
        System.out.println("Enter the number of Big Macs ( ):");
        //int nBigMacs = myScanner.nextInt( );
        double cost=0;
        if(myScanner.hasNextInt()) {
        int num=myScanner.nextInt();
        if (num>=0){ cost=2.22*num;
        System.out.println("You ordered"+num+"Big Macs for a cost of"+cost);
        
            
            
        }
        else{ 
            System.out.println("You did not enter a number > 0");return;
            
        
        }}
     
        else{
        System.out.println("Do you want an order of fries (Y/y/N/n)?:");
        double fries=2.15;
        double totalCost=fries+num
        char decision=myScanner.nextChar();
        if(myScanner.hasNextChar("Y")||myScanner.hasNextChar("y")
        System.out.println("You ordered fries at a cost of"+fries);
        System.out.println("The total cost is"+totalCost);
        }else if(myScanner.hasNextChar("N")||myScanner.hasNextChar("n")
            System.out.println("The total cost is"+num);
            
        } else{
            System.out.println("You did not enter Y/y/N/n");return;
    
            
        }
        
        return;    //leaves the program, i.e.
                //the program terminates
        
        }
    }
    }
        