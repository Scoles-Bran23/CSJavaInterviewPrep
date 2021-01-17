import java.util.Scanner;
//Resources
//https://www.youtube.com/watch?v=d-nh-xBHsgM
//https://www.studytonight.com/data-structures/search-algorithms
//https://www.studytonight.com/data-structures/binary-search-algorithm
/*
Binary Search

Binary Search is used with sorted array or list. In binary search, we follow the following steps:

We start by comparing the element to be searched with the element in the middle of the list/array.
If we get a match, we return the index of the middle element.
If we do not get a match, we check whether the element to be searched is less or greater than in value than the middle element.
If the element/number to be searched is greater in value than the middle number, then we pick the elements on the right side of the middle element(as the list/array is sorted,
hence on the right, we will have all the numbers greater than the middle number), and start again from the step 1.
If the element/number to be searched is lesser in value than the middle number, then we pick the elements
on the left side of the middle element, and start again from the step 1.
Binary Search is useful when there are large number of elements in an array and they are sorted.

So a necessary condition for Binary search to work is that the list/array should be sorted.

Features of Binary Search

It is great to search through large sorted arrays.
It has a time complexity of O(log n) which is a very good time complexity. We will discuss this in details in the Binary Search tutorial.
It has a simple implementation.

Logarithmic algorithm – O(logn) – Binary Search.
Linear algorithm – O(n) – Linear Search.
Superlinear algorithm – O(nlogn) – Heap Sort, Merge Sort.
*/

//ex 1
/**
1) works with sorted array
arr = [11, 15, 16, 19, 25, 36, 67]
search = 15

2) low = 0, high = arr.length - 1 (7)
3) mid = (low + high)/2 = 3

4) arr[3] = 19, 19 > 15

5) low = 0, high = mid - 1 (3-1 = 2)
6) mid = (0 + 2)/2  = 1

7) arr[1] = 15
**/
//ex 2
/**
low = 0, high = size - 1, search = x

while (low <= high){
  mid = (low + high)/2;
  if(arr[mid] == search){
    return
  }
  else if(search > arr[mid]){
    low = mid + 1;
  }
  else if(arr[mid] > search){
    high = mid - 1;
  }

}
**/
//ex 3
/**
arr = [11, 15, 16, 19, 25, 36, 67]
search = 36

1) low = 0, high = 6
2) mid = (0 + 6)/2 = 3, arr[3] = 19, 19 < 36

3) low = mid + 1 = 4, higih = 6
4) mid = (6 + 4)/2 = 5
5) arr[mid] = 36

**/
public class BinarySearch {
  public static void main(String[] args){

    Scanner in = new Scanner(System.in);
    System.out.println("enter the size of an array");
    int n = in.nextInt();
    //Declare array
    int[] arr = new int[n];
    System.out.println("enter the values in an array");
    for(int i = 0; i < n; i++){
      arr[i] = in.nextInt();
    }

    System.out.println("enter value to be searched");
    int num = in.nextInt();

    int low = 0;
    int high = n - 1;
    int mid = 0;

    while(low <= high){
      mid = (low + high)/2;

      if(arr[mid] == num){
        System.out.println("value is found at index " + mid);
        break;
      }
      else if(arr[mid] > num){
        high = mid - 1;
      }
      else if(arr[mid] < num){
        low = mid + 1;
      }
    }
    if(low > high){
      System.out.println("vaue is not found in array");
    }
  }



}
