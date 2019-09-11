public class Main {

   public static void main(String[] args) {

      int[] arr = {24,2,45,20,56,75,2,-56,98, 97,53,11};
      sort(arr);
      for(int i: arr)
         System.out.print(i + " ");

   }

   ////////////////////////////////////////////////////////////

   private static void sort(int[] array) {
      if (array == null || array.length == 0)
         return;

      quickSort(array, 0, array.length - 1);
   }

   ////////////////////////////////////////////////////////////

   private static void quickSort(int[] arr, int lowerIndex, int higherIndex) {
      int i = lowerIndex;
      int j = higherIndex;
      int pivot = arr[lowerIndex + (higherIndex - lowerIndex)];

      while(i <= j) {
         while(arr[i] < pivot)
            i++;
         while(arr[j] > pivot)
            j--;
         if(i <= j)
            swapNumbers(arr, i++, j--);
      }

      if(lowerIndex < j)
         quickSort(arr, lowerIndex, j);
      if(i < higherIndex)
         quickSort(arr, i, higherIndex);
   }

   ////////////////////////////////////////////////////////////

   private static void swapNumbers(int[] arr, int i, int j) {
      int temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;
   }

}