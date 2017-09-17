import java.util.Scanner;
import java.io.*;

public class HaleyIttner_1_10Outline {

   public static void main(String[] args) throws IOException {
      
      /* You will need two object here, one of type EmployeeParameters and the 
         other is and array of type Employee. */
         
      /* You will then call a method from the EmployeeParameters class to display the 
         the employee parameters from the text file */
         
      /* Then, you will need two files, one for the output and the other is the input,
         which is that list of names in the specs. Connect a scanner tot he input and a 
         print writer to the output. */
         
      /* When I wrote this assignment I had 7 more variables, all of which were ints.
         I will discuss what each is when they are needed. */  
      
     /* You then print a header that states the this is the regular input being outputted. */
     
     /* Next step is to make a loop, can be either a while or for loop. Inside 
        the loop you will make a new Employee instance and use the method we create 
        in this class to make a Employee object from the data read in(So name, gross pay etc.)
        Then, you will call three more methods made in this class that will calculate 
        te gross pay(one method) and the other amounts needed(second method, includes taxes etc)
        and the last one prints the details of the employee according to the spec(gross pay etc).        
        Then, you will add the employee to the array we created earlier and increment
        the lines read and i(for the index of the array). Then, end the loop. */
      
     /* Then, if the console still have inputs, but the array is full, we add it to another count
        of input lines over the array length and call console.nextLine() to get the next value. */
      
     /* Then, if the input lines over the size of the array is above zero, we tell the user then end 
        the program. */
     
     /* You will then call a method that we create int this class to print the totals of all the employees 
        amounts specified in the specs. */
         
      /* You will then call the selection sort method in the toolkit class to sort the array alphabetically. */
      
      /* You will then print a header that states it is now printing alphbetically then use another loop to
         print out the array again, using the detail printing method we used before. Then end with printing
         the totals again. */
      /* Then, you will call the selection sort method in the toolkit class again, but this time it is sorted
         by gross pay. Again, print the header indicating that it is sorted by gross pay. Another loop is used
         to print the array once more(using the print details method again) then print the totals. */
      /* Then, make sure to close the print writer and scanner at the end of main. */
      }      
}