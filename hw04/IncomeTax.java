////////////////////////////////////////////////////////////////////////////////
//Jack Fields
//HW 04
//IncomeTax Program
//
// first compile the program
// javac IncomeTax.java
// run the program
// java IncomeTax//

    import java.util.Scanner;
// define a program
public class IncomeTax {
    // main method needed for every Java program
    public static void main (String [ ] args) {
        Scanner myScanner;
        myScanner = new Scanner ( System.in );
        System.out.println("Enter an int giving the number in thousands:");
        boolean income = myScanner.hasNextInt();
        if(myScanner.hasNextInt()) {
            int num=myScanner.nextInt();
            if (num >= 0)
            {
                if(num<20)
                {
                System.out.println("The tax rate on $" + num*1000 + "is 5% and the tax is " + ((int)(num*1000 * .05 *100)/100.0));
                }
                if (num>=20 && num<40) 
                {
                System.out.println("The tax rate on $" + num*1000 + "is 7% and the tax is " + ((int)(num*1000 * .07 * 100)/100.0));
                }
                if (num>=40 && num<78) 
                {
                System.out.println("The tax rate on $" + num*1000 + "is 12% and the tax is " + ((int)(num*1000 * .12 * 100)/100.0));
                }
                if (num>=78) 
                {
                System.out.println("The tax rate on $" + num*1000 + "is 5% and the tax is " + ((int)(num*1000 * .14 *100)/100.0));
                }
            }
            else 
            {
                System.out.println("That's not positive");
            }
        }
        else 
        {
            System.out.println("Enter an int");
        }
    } //end of method
} //end of main class   

            
       
