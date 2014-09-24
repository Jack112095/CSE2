////////////////////////////////////////////////////////////////////////////////
//Jack Fields
//HW 04
//TimePadding Program
//
// first compile the program
// javac TimePadding.java
// run the program
// java TimePadding//

    import java.util.Scanner;
// define a program
public class TimePadding {
    // main method needed for every Java program
    public static void main (String [ ] args) {
        Scanner myScanner;
        myScanner = new Scanner ( System.in );
        System.out.println("Enter the number of seconds:");
        int seconds=myScanner.nextInt();
        if (seconds<0){
            System.out.println("That time isn't possible");
        }
        int hour=((int)seconds/3600);
        if (hour<0 || hour>24){
            System.out.println("That doesn't exist");
        }
        int minute=((seconds - 3600*(seconds/3600))/60);
        int seconds1=(seconds-((minute*60+(hour*3600)*(seconds/minute*60+(seconds/3600)))));
        System.out.print(" The time is " + hour);
        if (minute<10)
            System.out.print(":0"+minute);
        else System.out.print(":"+minute);
        if (seconds1<10)
            System.out.print(":0"+seconds1);
        else System.out.print(":"+seconds1);
    } //end of main method
} //end of class
    
        
        