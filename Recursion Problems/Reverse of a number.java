class Solution {
  public static int reverse(int n, int rev) { 
    //n== Number to be processed, rev==0(Initially)
    if(n==0) { //Base Condition
      return rev;
    }
    return reverse(n/10,rev * 10 + (n%10));
  }
}
    
