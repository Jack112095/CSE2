////////////////////////////////////////////////////////////////////////////////
//Jack Fields
//Lab 05
//RandomGames java
//
// first compile the program
// javac RandomGames.java
// run the program
// java RandomGames

import java.util.Scanner;
// define a program
public class RandomGames {
    // main method needed for every Java program
    public static void main (String[] args) {
        Scanner myScanner;
        myScanner = new Scanner ( System.in );
        int suit = (int)(Math.random()*4)+1;
        int randomnum = (int)(Math.random()*37)+1;
        int randomnum1 = (int)(Math.random()*6)+1;
        int randomnum2 = (int)(Math.random()*6)+1;
        int randonum3 = randomnum1 + randomnum2;
        int randomnum4 = (int)(Math.random()*13)+1;
        System.out.println("Enter R or r for Roulette, C or c for craps, P or p for pick a card -");
        String decision = myScanner.next();
        if(decision.equals("R") || decision.equals("r")){
            if (randomnum == 0){
                System.out.println("Roulette: 00");
            }
            if (randomnum == 1){
                System.out.println("Roulette: 0");
            }
            if (randomnum == 2){
                System.out.println("Roulette: 1");
            }
            if (randomnum == 3){
                System.out.println("Roulette: 2");
            }
            if (randomnum == 4){
                System.out.println("Roulette: 3");
            }
            if (randomnum == 5){
                System.out.println("Roulette: 4");
            }
            if (randomnum == 6){
                System.out.println("Roulette: 5");
            }
            if (randomnum == 7){
                System.out.println("Roulette: 6");
            }
            if (randomnum == 8){
                System.out.println("Roulette: 7");
            }
            if (randomnum == 9){
                System.out.println("Roulette: 8");
            }
            if (randomnum == 10){
                System.out.println("Roulette: 9");
            }
            if (randomnum == 11){
                System.out.println("Roulette: 10");
            }
            if (randomnum == 12){
                System.out.println("Roulette: 11");
            }
            if (randomnum == 13){
                System.out.println("Roulette: 12");
            }
            if (randomnum == 14){
                System.out.println("Roulette: 13");
            }
            if (randomnum == 15){
                System.out.println("Roulette: 14");
            }
            if (randomnum == 16){
                System.out.println("Roulette: 15");
            }
            if (randomnum == 17){
                System.out.println("Roulette: 16");
            }
            if (randomnum == 18){
                System.out.println("Roulette: 17");
            }
            if (randomnum == 19){
                System.out.println("Roulette: 18");
            }
            if (randomnum == 20){
                System.out.println("Roulette: 19");
            }
            if (randomnum == 21){
                System.out.println("Roulette: 20");
            }
            if (randomnum == 22){
                System.out.println("Roulette: 21");
            }
            if (randomnum == 23){
                System.out.println("Roulette: 22");
            }
            if (randomnum == 24){
                System.out.println("Roulette: 23");
            }
            if (randomnum == 25){
                System.out.println("Roulette: 24");
            }
            if (randomnum == 26){
                System.out.println("Roulette: 25");
            }
            if (randomnum == 27){
                System.out.println("Roulette: 26");
            }
            if (randomnum == 28){
                System.out.println("Roulette: 27");
            }
            if (randomnum == 29){
                System.out.println("Roulette: 28");
            }
            if (randomnum == 30){
                System.out.println("Roulette: 29");
            }
            if (randomnum == 31){
                System.out.println("Roulette: 30");
            }
            if (randomnum == 32){
                System.out.println("Roulette: 31");
            }
            if (randomnum == 33){
                System.out.println("Roulette: 32");
            }
            if (randomnum == 34){
                System.out.println("Roulette: 33");
            }
            if (randomnum == 35){
                System.out.println("Roulette: 34");
            }
            if (randomnum == 36){
                System.out.println("Roulette: 35");
            }
            if (randomnum == 37){
                System.out.println("Roulette: 36");
            }
        }
        if(decision.equals("C") || decision.equals("c")){
            System.out.println("Craps:" + randomnum1 + "+" + randomnum2 + "=" + randonum3);
        }
        if(decision.equals("P") || decision.equals("p")){
            if (suit == 1 && randomnum4!=11 && randomnum4!=12 && randomnum4!=13 && randomnum4!=14){
                System.out.println(randomnum4 + " of hearts");
            }
            if (suit == 1 && randomnum4 == 11){
                System.out.println("Jack of hearts");
            }
            if (suit == 1 && randomnum4 == 12){
                System.out.println("Queen of hearts");
            }
            if (suit == 1 && randomnum4 == 13){
                System.out.println("King of hearts");
            }
            if (suit == 1 && randomnum4 == 14){
                System.out.println("Ace of hearts");
            }
            if (suit == 2 && randomnum4!=11 && randomnum4!=12 && randomnum4!=13 && randomnum4!=14){
                System.out.println(randomnum4 + " of clubs");
            }
            if (suit == 2 && randomnum4 == 11){
                System.out.println("Jack of clubs");
            }
            if (suit == 2 && randomnum4 == 12){
                System.out.println("Queen of clubs");
            }
            if (suit == 2 && randomnum4 == 13){
                System.out.println("King of clubs");
            }
            if (suit == 2 && randomnum4 == 14){
                System.out.println("Ace of clubs");
            }
            if (suit == 3 && randomnum4!=11 && randomnum4!=12 && randomnum4!=13 && randomnum4!=14){
                System.out.println(randomnum4 + " of diamonds");
            }
            if (suit == 3 && randomnum4 == 11){
                System.out.println("Jack of diamonds");
            }
            if (suit == 3 && randomnum4 == 12){
                System.out.println("Queen of diamonds");
            }
            if (suit == 3 && randomnum4 == 13){
                System.out.println("King of diamonds");
            }
            if (suit == 3 && randomnum4 == 14){
                System.out.println("Ace of diamonds");
            }
            if (suit == 4 && randomnum4!=11 && randomnum4!=12 && randomnum4!=13 && randomnum4!=14){
                System.out.println(randomnum4 + " of spades");
            }
            if (suit == 4 && randomnum4 == 11){
                System.out.println("Jack of spades");
            }
            if (suit == 4 && randomnum4 == 12){
                System.out.println("Queen of spades");
            }
            if (suit == 4 && randomnum4 == 13){
                System.out.println("King of spades");
            }
            if (suit == 4 && randomnum4 == 14){
                System.out.println("Ace of spades");
            }
        
    }
}
}
            
    
