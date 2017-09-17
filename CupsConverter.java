//Purpose: To convert from cups to ounces.
import java.util.Scanner;

public class CupsConverter {

   public static void main(String [] args) {
      double cups = 0; // The number of cups to be coverted instantiated to 0
      double ounces = 0; // The number of ounces instantiated to 0
      
       /* The scanner that will be used to read the users input from the 
       console(System.in). Instantiated to a new scanner with the input of 
      System.in. */
      Scanner scnr = new Scanner(System.in);
                                                
      /* Explanation to the user what the program does. */                                        
      System.out.println("This program coverts cups to ounces"); 
      
      /* Input number of cups(The is the input requirement) 
      EDIT: Input number of cups from the keyboard. */
      
      /* Prompt the user to input the number of cups they want to convert. */
      System.out.println("Please enter the amount of cups");
      
      /* Taking the users input from the scanner, converting it to a double 
         and assigning it to the variable cups. */                                                                 
      cups = scnr.nextDouble(); 
      
      // Calculate number of ounces(This is the process requirement).
      
      /* Converting number of cups to ounces and assigning that 
      value to the ounces variable. */
      ounces = cups * 8; 
      
      // Output the number of cups and ounces(This is the output requirement).
       
      /* Outputs to the console the number of cups(what the user inputted(echo!))
         plus the ounces(What we processed/calculated).*/
      System.out.println(cups + " cups is " + ounces + " ounces.");
                                                                             
      scnr.close(); /* Close the scanner we were using.
                    Not necessary, but a good practice. */
      
      System.exit(0); /* Exit out of the program. We do this after everything 
                      is done in the main. This is not necessary, 
                      but a good practice. */
                      
   } // Close main method.
} // Close class. 