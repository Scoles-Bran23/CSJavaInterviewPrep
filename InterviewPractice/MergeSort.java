public class MergeSort {


  private static void printArray(int[] array){
    for(int i : array){
      System.out.print(i + " ");
    }
  }

  private static int[] mergeSort(int[] array){
    //recursive "break" statement
    if(array.length <= 1){
      return array;
    }

    int midpoint = array.length / 2;

    int[] left = new int[midpoint];
    int[] right = new int[midpoint];
  }

}
