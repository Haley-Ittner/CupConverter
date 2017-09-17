public class Coding_Bat_Exercise {

   public static void main(String[] args) {
      int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
      int[] orderedNumbers = new int[numbers.length];
      orderedNumbers = evenOdd(numbers); 
      printArray(orderedNumbers); 
   }




   public static int[] evenOdd(int[] nums) {
      int[] even = new int[nums.length];
      int evenCount = 0; 
      int[] odd = new int[nums.length];
      int oddCount = 0; 
      int[] total = new int[nums.length];
      for(int i = 0; i < nums.length; i++) {
         if(nums[i] % 2 == 0) {
            even[evenCount] = nums[i];
            evenCount++;
         }
         else {
            odd[oddCount] = nums[i];
            oddCount++;
      }
   }
      int index = 0;
      for(int j = 0; j < evenCount; j++) {
         total[j] = even[j];
         index++;
      }
      for(int k = 0; index < total.length; k++) {
         total[index] = odd[k];
         index++;
      }
      return total;
   } 

   public static void printArray(int[] array) {
      System.out.print("[");
      for( int q = 0; q < array.length; q++) {
         System.out.print(array[q] + ", ");
      }
   }
}   