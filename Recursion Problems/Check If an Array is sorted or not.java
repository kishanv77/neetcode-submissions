class Solution {
  public static boolean isSorted(int[] arr, int index) {
    //Base Condition
    if(index== arr.length-1) {
      return true;
    }
    if(arr[index] > arr[index + 1]) {
      return false;
    }
    return isSorted(arr,index + 1);
  }
}
