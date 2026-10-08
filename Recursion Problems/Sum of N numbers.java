class Solution {
  static int sum(int n) {
    //Base condition
    if(n==0) {
      return 0;
    }
    return n + sum(n-1);
  }
}
