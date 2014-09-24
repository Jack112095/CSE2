////////////////////////////////////////////////////////////////////////////////
//Jack Fields
//HW 04
//Month Program
//
// first compile the program
// javac Month.java
// run the program
// java Month//
//Write a program that prompts the user to enter an integer for the month (1 for January, 2 for February, etc.)  and then displays the number of days in the month).  If the number 2 is entered (February) the user is then asked to enter the year. Make sure that the user enters an integer for the month and that the integer is in the required range. 
//Similarly, if the year is requested, ensure that an int is entered, and that the int is positive.

    import java.util.Scanner;
// define a program
public class Month {
    // main method needed for every Java program
    public static void main (String [ ] args) {
        Scanner myScanner;
        myScanner = new Scanner ( System.in );
        System.out.println("Enter an int giving the number of the month (1-12)");
        int month=myScanner.nextInt();
        System.out.println("Enter an int giving the year");
        int year=myScanner.nextInt();
        boolean isLeapYear=(year % 4 == 0 && year % 100 != 0) || (year % 400 ==0);
        if(month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12){
            System.out.println("This month has 31 days");
        }
        else if(month==4 || month==6 || month==9 || month==11){
            System.out.println("This month has 30 days");
        }
        else if((month==2) && ((year%4 == 0 && year % 100 != 0)) || (year % 400 ==0)){
            System.out.println("This month has 29 days");
        }
        else if(month==2){
            System.out.println("This month has 28 days");
        }
        
    } //end of method
}//end of class
        