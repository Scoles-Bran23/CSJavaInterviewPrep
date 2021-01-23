//Resources:
//https://www.youtube.com/watch?v=yv6svAfoYik
//https://www.youtube.com/watch?v=JSceec-wEyw
//split into sub arrays and merge the sub arrays
/*
How to code the merge sort algorithm in Java 8.
Merge sort is a sorting algorithm that splits an array into halves until each
half has a single element. It then merges the split arrays,
returns the merge, and continues up the recursive ladder
until the whole sorted array is returned.
*/

public class MergeSort {


  private static void printArray(int[] array){
    for(int i : array){
      System.out.print(i + " ");
    }
    System.out.println();
  }

  private static int[] mergeSort(int[] array){
    //recursive "break" statement
    if(array.length <= 1){
      return array;
    }

    int midpoint = array.length / 2;

    int[] left = new int[midpoint];
    int[] right;
    //in case the length of the array is uneven
    if(array.length % 2 == 0){
      right = new int[midpoint];
    }
    else{
      right = new int[midpoint + 1];
    }

    //populate left and right arrays
    for(int i = 0; i < midpoint; i++){
      left[i] = array[i];
    }
    for(int j = 0; j < right.length; j++){
      right[j] = array[midpoint + j];
    }
    int[] result = new int[array.length];
    //recursive: calling itself inside function
    left = mergeSort(left);
    right = mergeSort(right);

    result = merge(left, right);

    return result;

  }

  private static int[] merge(int[] left, int[] right){
    int[] result = new int[left.length + right.length];

    int leftPointer, rightPointer, resultPointer;
    //initialize them all to zero
    leftPointer = rightPointer = resultPointer = 0;

    while(leftPointer < left.length || rightPointer < right.length){
      //checking if they both have elements in them
      if(leftPointer < left.length && rightPointer < right.length){
        if(left[leftPointer] < right[rightPointer]){
          result[resultPointer++] = left[leftPointer++];
        }
        else {
          result[resultPointer++] = right[rightPointer++];
        }
      }
      //only elements in left array
      else if(leftPointer < left.length){
        result[resultPointer++] = left[leftPointer++];
      }
      //only elements in right array
      else if(rightPointer < right.length){
        result[resultPointer++] = right[rightPointer++];
      }
    }
    return result;
  }

  public static void main(String args[]){
    int[] array = {5, 4, 3, 2, 1};
    System.out.println("initial array: ");
    printArray(array);
    array = mergeSort(array);
    System.out.println("sorted array: ");
    printArray(array);
  }

}
