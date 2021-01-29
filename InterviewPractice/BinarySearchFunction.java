public class BinarySearchFunction {

  public int binarySearchIterative(int arr[], int x){
    int l = 0;
    int r = arr.length - 1;
    while (l <= r){
      int m = 1 + (r - 1)/2;

      if(arr[m] == x){
        return m;
      }
      if(arr[m] > x){
        l = m + 1;
      }
      else{
        r = m - 1;
      }
    }
    return -1;
  }
  public static void main(String args[]){
    BinarySearchFunction ob = new BinarySearch;
    int arr[] = {2, 3, 4, 10, 40};
    int n = arr.length;
    int x = 10;
    int result = ob.binarySearch(arr, x);
    if(result == -1){
      System.out.println("nope");
    }
    else{
      System.out.println("element at " + result);
    }
  }
}
