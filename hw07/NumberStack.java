////////////////////////////////////////////////////////////////////////////////
//Jack Fields
//HW07
//NumberStack Program
//
// first compile the program
// javac NumberStack.java
// run the program 
// java NumberStack

//Write a program that forces the user to enter an integer between 1 and 9, inclusive, 
//and then prints out displays that depend on the value entered and look like the following:
/*import java.util.Scanner;
public class NumberStack{  //class
    public static void main (String [] args){ //main method
    Scanner myScanner;
        myScanner = new Scanner ( System.in );
        System.out.print("Enter an integer between 1 and 9 - ");
        int integer = myScanner.nextInt();
        String a = "-";
        if(integer > 9){
            System.out.println("Number is not in range. Try again.");
        }
        
    for(int j=1; j < integer+1; j++){
     
        for(int i=0; i < j; i++){
        
        
        for (int n=1; n < 2*j; n++){
        System.out.print(j);
        
        } 
        System.out.println();
    }
      
    System.out.println(a);
    a = a+ "--"; 
    
    
    }
    
    }
}
*/

/*import java.util.Scanner;
public class NumberStack{  //class
    public static void main (String [] args){ //main method
    Scanner myScanner;
        myScanner = new Scanner ( System.in );
        System.out.print("Enter an integer between 1 and 9 - ");
        int integer = myScanner.nextInt();
        String a = "-";
        int j=1;
        int i=0;
        int n=1;
        while(j < integer+1){
            while (i < j){
                while (n <2*j){
                   System.out.print(j); 
                   n++;
                } n=1;
                System.out.println();
                i++;
            } i=0;
            System.out.println(a);
            j++;
            a = a+ "--";
        } j=1;
    
    }
}
*/
import java.util.Scanner;
public class NumberStack{  //class
    public static void main (String [] args){ //main method
    Scanner myScanner;
        myScanner = new Scanner ( System.in );
        System.out.print("Enter an integer between 1 and 9 - ");
        int integer = myScanner.nextInt();
        String a = "-";
        int j=1;
        System.out.println("1");
        do{
            System.out.println(a); j++; a=a+"--";
            int i=0;
            do{
                 i++;
                int n=1;
            do{
                System.out.print(j); n++;
            } while (n < 2*j); 
             System.out.println();
                
            } while (i < j); 
            
        } while (j < integer);
        
    }
    
}

                
                
            
        




