////////////////////////////////////////////////////////////////////////////////
//Jack Fields
//Lab06
// Enigma2 Program
//
//first compile the program
//javac Enigma2.java
//run the program
//java Enigma2

import java.util.Scanner;
public class Enigma2{
  public static void main(String [] arg){
    int n=40,k=60;
    String out="";
    switch(n){
      case 12: 
      case 13: out+=13;
      case 40: out+=40/0;
    }
    System.out.println(out);
  }
}