////////////////////////////////////////////////////////////////////////////////
//Jack Fields
//HW 04
//CourseNumber Program
//
// first compile the program
// javac CourseNumber.java
// run the program
// java CourseNumber
//The semester during which a course is offered at Lehigh is given by a 6 digit number. 
//The first four digits give the year, and the last two digits give the semester: 
//10 spring, 20 summer 1, 30 summer 2, and 40 fall.

import java.util.Scanner;
// define a program
public class CourseNumber {
    // main method needed for every Java program
    public static void main (String[] args) {
        Scanner myScanner;
        myScanner = new Scanner ( System.in );
       System.out.println("Enter a six digit number giving the course semester:");
       int num=myScanner.nextInt();
       System.out.println(" num " + num%100/10);
       if(num<186510 || num>201440){
           System.out.println("It doesn't exist. Try again");
       }
       if(((int)(num - 100*num/100)/10) = 1){
           System.out.println("The course was offered in the Spring semester of" + ((int)num/100));
       }
       else if(((int)(num - 100*num/100)/10) = 2){
           System.out.println("The course was offered in the Summer 1 semester of" + ((int)num/100));
       }
       else if(((int)(num - 100*num/100)/10) = 3){
           System.out.println("The course was offered in the Summer 2 semester of" + ((int)num/100));
       }
       else if(((int)(num - 100*(num/100)/10) = 4)){
           System.out.println("The course was offered in the Fall semester of" + ((int)num/100));
       }
       
       }//end of method
       
    } //end of class
 