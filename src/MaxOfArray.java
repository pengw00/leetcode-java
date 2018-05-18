public class MaxOfArray{
   public static int max(int[] m) {
      int Max = m[0];
      for (int i: m){
         if(Max <= i){
            Max = i;
         }
      }
      return Max;
   }
   public static void main(String[] args) {
      int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6}; 
      System.out.println(max(numbers));
   }
}