import java.util.Scanner;

public class PrintExercise {

   public static void main(String[] args) {
      int[] numbers = {1, 4, 5, 8, 10, 98, 37, 97, 65, 154, 76, 88, 95, 69, 87, 56, 12, 6, 87, 120};
      String[] letters;
       Scanner scnr = new Scanner(System.in);
       int number = 0;
       int dur = 0;
       String line = "";
       System.out.print("Please enter a number: ");
       number = scnr.nextInt();
       
       do {
         System.out.print("Please enter another number: ");
         dur = scnr.nextInt();
         if(dur > numbers.length) {
            System.out.println("Please enter a lower number");
         }   
       } while(dur > numbers.length);
       letters = new String[dur];     
       for(int i = 0; i < dur; i++) {
         if(numbers[i] > number) {
            line = (numbers[i] - number) + "";
         } else if(numbers[i] %2 != 0) {
            numbers[i] = numbers[i] * 2;
            line = numbers[i] + "";
         } else if(numbers[i] < number) {
            line = numbers[i] + "";
         } else if(numbers[i] == number) {
            line = "SPLAT!";
         } else {
            line = "*";
         } 
         letters[i] = line;   
       }  
   }
} 