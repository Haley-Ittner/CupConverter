import java.util.Scanner;

public class SiSample {

   public static void main(String [] args) {
      int area = 0;
      String fence = ""; 
      Scanner scnr = new Scanner(System.in);
      System.out.println("Please input your fence length(0 - 10)");
      fence = scnr.nextLine();
      
      switch (fence) {
         
         case "hello": System.out.println("Woo");
         
      }                    
   }            
}