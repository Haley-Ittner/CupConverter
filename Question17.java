import java.util.Scanner;

public class Question17 {

   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int numberOfInputs = 0;
      double mileage = 0.0;
      double reimburse = 0.0;
      String stars = "****";
      String line = "";
      double mileTotal = 0.0;
      double reimburseTotal = 0.0;
      int overZero = 0;
      
      do {
         System.out.print("Please input some shit");
         numberOfInputs = scnr.nextInt();
      
         if (numberOfInputs <= 0) {
            System.out.println("Please input a valid number");
         }   
         }while (numberOfInputs <= 0);
         
         for(int i = 0; i <= numberOfInputs; i++) {
            System.out.print("Please input your " + (i + 1) + " number");
            mileage = scnr.nextDouble();
            if (mileage <= 0) {
               reimburse = 0.0;
            } else if (mileage <= 500) {
               reimburse = mileage * .15;
            } else if (mileage <= 1000) {
               reimburse = 75 + ((mileage - 500) * .12);
            } else if (mileage <= 2000) {
               reimburse = 135 + ((mileage - 1000) * .1);
            } else {
               reimburse = 235 + ((mileage - 2000) * .08);
            }
            
            if (reimburse == 0.0) {
               line = mileage + "\t" + stars;
            } else {
               line = mileage + "\t" + reimburse;
               aboveZero++;
               mileageTotal += milage;
               reimburseTotal += reimburse;
            }
            System.out.println(line);
         }
         line = "Number of inputs above zero: " + aboveZero +
                "\nTotal Mileage: " + mileageTotal +
                "\nTotal Reimbursed: " + reimburseTotal;
         System.out.println(line);                                
   }
}  
      