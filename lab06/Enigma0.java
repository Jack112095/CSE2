////////////////////////////////////////////////////////////////////////////////
//Jack Fields
//Lab06
// Enigma0 Program
//
//first compile the program
//javac Enigma0.java
//run the program
//java Enigma

import java.util.Scanner;
public class Enigma0{
  public static void main(String arg []){
      Scanner scan=new Scanner(System.in);
      
    System.out.print("Enter an int- ");
    int n=scan.nextInt();
    if(scan.hasNextInt()){
      System.out.println("You entered "+n);
    }
    
    
    int k=4,p=6,q=7,r=8;
    switch(k+p+q+r){
      case 24: 
      case 25: System.out.println("sum is 25");
      default:
        System.out.println("To repeat, you entered "+n);
    }
  }
}

/* Error report: Many lines are out of order, eg. Scanner scan was out of order.
int n has already been defined. The else statement is not necessary. Scan*/