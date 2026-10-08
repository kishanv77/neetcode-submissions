class Solution {
  static long factorial(int n) {
    //Base condition
    if(n==0) {
      return 1;
    }
    return n * factorial(n-1);
  }
}
