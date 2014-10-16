////////////////////////////////////////////////////////////////////////////////
//Jack Fields
//HW06
//Roulette Program
//
// first compile the program
// javac Roulette.java
// run the program 
// java Roulette
//I don’t usually go to gambling casinos, but I attended the birthday party of a friend at the Mohican Sun, in Connecticut. 
//There I met another person attending the party who told me about how he gambles at roulette. 
//He brings $100 to the table and places a $1 bet on the same (randomly selected) number for 100 spins of the roulette wheel. 
//He claims that he often wins money with this “system.”  For this program, use a random number generator (recall Math.random()) to simulate this person’s betting on 100 spins, but run the simulation 1000 times and collect data on the outcome. 
//(As an alternative, you could buy a roulette wheel and spin it 100,000 times and record the results. Computer scientists prefer to simulate the outcome with a computer. 
//Such simulations are called Monte Carlo simulations.)  
//Roulette rules for betting on a single number are straightforward: There are 38 possible numbers. If my number comes up I am given $36. 
//For 100 spins, if my number comes up 3 or more times, I walk away with 3x$36=$108 or more. Thus, if my number comes up at least 3 times I win money; otherwise I lose money. 
//For the 1000 repetitions of the 100-spin simulation, compute the number of times I lose everything (my number never comes up), 
//compute the total winnings (of all simulations added together), and compute the number of times I walked away with a profit in one session of 100 spins of the wheel. 
//Store the program in the file Roulette.java and store the file in lab06 on Cloud9.

import java.util.Random;    
public class Roulette{  //class
    public static void main (String [] args){   //main method
        Random rand = new Random();
        
        // initializing counters and variables
        int roulette = rand.nextInt(39);
        int Bet = 0;
        int round100 = 0;
        int win = 0; 
        int round1000 =0;
        int Profit = 0;
        int money = 0;
        int lose = 0;
        
        while(round1000<1001){    
            while( round100 < 101){   
                Bet = rand.nextInt(39);  
                
                    if(roulette == Bet){
                        win +=1; 
                    }
                    round100+=1;  
                }
                 
            if(win>=3){
                Profit+=1;   
                money = ((win*36)-100)+money;
            }
            if(win == 0){    
                lose +=1;
            }
            round100=0;   
            win=0;   
            round1000+=1; 
        }
        
System.out.println("You lost " + lose + " times, won $ " + money + " and walked away with a profit " + Profit + " times in one session of 100 spins");  
                }
}
