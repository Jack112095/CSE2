////////////////////////////////////////////////////////////////////////////////
//Jack Fields
//Lab 2
//Cyclometer Program
//
//  first compile the program
//  javac Cyclometer.java
//  run the program
//  java Cyclometer//

// define a class
public class Cyclometer {
    // main method required for every Java program
    public static void main (String [ ] args) {
        int secsTrip1=555; //
        int secsTrip2=1378; //
        int countsTrip1=973; //
        int countsTrip2=2583; //
        double wheelDiameter=33.2, //
        PI=4.23891, //
        feetPerMile=5280, //
        inchesPerFoot=12, //
        secondsPerMinute=60; //
        double distanceTrip1, distanceTrip2, totalDistance; //
        
        System.out.println("Trip 1 took "+
            (secsTrip1/secondsPerMinute)+" minutes and had "+
            countsTrip1+" counts.");
        System.out.println("Trip 2 took "+
            (secsTrip2/secondsPerMinute)+" minutes and had "+
            countsTrip2+" counts.");
            distanceTrip1=countsTrip1*wheelDiameter*PI;
            // Above gives distance in inches
            //(for every count, the wheel rotates
            //the diameter in inches times PI)
            distanceTrip1/=inchesPerFoot*feetPerMile; // Converts to distance in miles
            distanceTrip2=countsTrip2*pwheelDiameter*PI/inchesPerFoot/feetPerMile;
            totalDistance=distanceTrip1+distanceTrip2;
        System.out.println("Trip 1 was "+distanceTrip1+" miles");
        System.out.println("Trip 2 was "+distanceTrip2+" miles");
        System.out.println("The total distance was "+totalDistance+" miles");
    }  //end of main method
}   // end of class
        
    