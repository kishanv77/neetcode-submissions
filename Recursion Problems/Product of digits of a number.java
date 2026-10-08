class Solution {
  static int product(int n) {
    //Base condition
    if((n<10) {
      return n;
    }
    return (n%10) * product(n/10);
  }
}
