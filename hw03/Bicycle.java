////////////////////////////////////////////////////////////////////////////////
//Jack Fields
//HW 03
// Bicycle Program
//
// first compile the program
// javac Bicycle.java
// run the program
// java Bicycle//

    import java.util.Scanner;
// define a program
public class Bicycle {
    // main method needed for every Java program
    public static void main (String [ ] args) {
        Scanner myScanner;
        myScanner = new Scanner ( System.in );
        System.out.println("Enter the number of seconds: ");
        int secsTrip1=myScanner.nextInt( ); // number of seconds for the trip
         System.out.println("Enter the number of counts: ");
        int countsTrip1=myScanner.nextInt ( ); // number of counts for the trip
        double wheelDiameter=27;
        double PI=3.14159;
        double feetPerMile=5280;
        double minutesPerHour=60;
        double inchesPerFoot=12;
        double secondsPerMinute=60; 
        double circumference=wheelDiameter*3.14159;
        double milesPerCount=(circumference/inchesPerFoot)/feetPerMile;
        double TripLentinMin=secsTrip1/secondsPerMinute;
        double TripLenthinMiles= ((int)(countsTrip1*circumference/inchesPerFoot/feetPerMile*100)/100.0);
        double milesPerHour=(TripLenthinMiles/(TripLentinMin/minutesPerHour));
            // Above gives distance in inches
            //(for every count, the wheel rotates
            //the diameter in inches times PI)
        System.out.println("The distance was" + TripLenthinMiles+ "miles and took"
        + TripLentinMin+ "minutes");
        System.out.println("The average mph was" +milesPerHour);
        
        
    } //end of main method
} // end of class