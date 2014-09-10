////////////////////////////////////////////////////////////////////////////////
//Jack Fields
//HW 02
//Arithmeitc Java Program
//
// first compile the program
//    javac Arithmeitc.java
// run the program
//    java Arithmetic//
//
// define the class
    public class Arithmetic{
    
    // add main method
    public static void main(String[ ] args) {
        
    //Number of pairs of socks
    int nSocks=3;
    //Cost per pair of socks
    //(‘$’ is part of the variable name)
    double sockCost$=2.58;

    //Number of drinking glasses
    int nGlasses=6;
    //Cost per glass
    double glassCost$=2.29;

    //Number of boxes of envelopes
    int nEnvelopes=1;
    //cost per box of envelopes
    double envelopeCost$=3.25;
    double taxPercent=0.06;
    double totalSockCost$ = (nSocks * sockCost$);   //total cost of socks
    double totalGlassCost$ = (nGlasses * glassCost$); //total cost of glass
    double totalEnvelopeCost$ = (nEnvelopes * envelopeCost$); //total cost of envelopes
    double taxSockCost$ = (totalSockCost$ + (totalSockCost$ * taxPercent));
    double taxGlassCost$ = (totalGlassCost$ + (totalSockCost$ * taxPercent));
    double taxenvelopesCost$ = (totalEnvelopeCost$ + (totalEnvelopeCost$ * taxPercent));
    System.out.println("Socks" );
    System.out.println("-Number of socks;" + nSocks );
    System.out.println("-Cost of socks; $" + sockCost$);
    System.out.println("Glasses");
    System.out.println("-Number of Glasses:" + nGlasses);
    System.out.println("-Cost of Glasses: $" + glassCost$);
    System.out.println("Envelopes");
    System.out.println("-Number of envelopes:" + nEnvelopes );
    System.out.println("-Cost of envelopes: $" + envelopeCost$);
    System.out.println("Sales tax for all itmes is 6%");
    System.out.println("Total cost of socks without tax: $" +7.74);
    System.out.println("Total cost of glasses without tax: $" +13.74);
    System.out.println("Total cost of envelopes without tax: $" +3.25);
    System.out.println("Total cost of socks with tax: $" +8.20);
    System.out.println("Total cost of glasses with tax: $" +14.56);
    System.out.println("Total cost of envelopes with tax: $" +3.45);
    System.out.println("Total tax: $" +1.52);
    System.out.println("Total cost of all items without tax: $" +24.73);
    System.out.println("Total cost of all items with tax: $" +26.21);
    
  
    }
}