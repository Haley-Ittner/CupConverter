import java.util.Scanner;

public class Fibbinocci {

   public static void main(String [] args) {
      int first = 0;
      int second = 1;
      int tmp = 1;
      int userNum = 0;
      int count = 2;
      String fibin = "0 1";
      Scanner scnr = new Scanner(System.in);
      
      System.out.print("How many fibbinocci numbers do you want to go up to? ");
      userNum = scnr.nextInt();
      
      while (userNum < 0) {
         System.out.print("Please input a positive number. ");
         userNum = scnr.nextInt();
      }
      
      while (count < userNum) {
         tmp = first + second;
         fibin += " " + tmp + "" + " ";
         first = second;
         second = tmp;
         count++;
      }       
      System.out.print(fibin); 
      
      for(int x = 2; x < userNum; x++) {
         tmp = first + second;
         fibin += " " + tmp + "" + " ";
         first = second;
         second = tmp;
      }
      System.out.print(fibin);  
   }
}