class Solution {
  static int sumD(int n) {
    //Base condition
    if(n==0) {
      return 0;
    }
    return (n%10) + sumD(n/10);
  }
}
