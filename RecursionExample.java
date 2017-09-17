import java.util.Scanner;

public class RecursionExample {

   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String test = "  Chickens  ";
      String fixed = removeSpaces(test);
      System.out.println("Here is the fixed string: " + fixed);
      int summer = sumNumbers(5);
      System.out.println("Here is the summation of 5 numbers: " + summer);
      getNumbers(scnr);
      int[] nums = new int[1];
      System.out.println(nums[0]);
   }
   
   public static String removeSpaces(String word) {
      if (word == null) {
        System.out.println("No word found");
      }
      else if (word.equals("")) {
         return word;
      }   
      else if (word.substring(0, 1).equals(" ")) {
         return removeSpaces(word.substring(1, word.length()));
      }   
      else {
         return word.substring(0, 1) + removeSpaces(word.substring(1, word.length()));
      }
      return word;
   }
   
   public static int sumNumbers(int n) {
	   if (n == 1) {
		   return n;
	   } else {
		   return n + sumNumbers(n - 1);
	   } 
   }
   
   public static void getNumbers(Scanner scan) {
      int tester = 0;
      int correct = 1;
      do {
      System.out.print("Please input a number: ");
      try {
         tester = scan.nextInt();
      } catch (Exception e) {
         System.out.println("You must input a number");
         correct = 0;
         String clear = scan.nextLine();   
      }
      correct = 1;
      } while (tester <= 0 || correct == 0); 
   }
}