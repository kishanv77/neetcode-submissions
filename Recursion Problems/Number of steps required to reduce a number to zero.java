class Solution {
  public int noOfSteps(int n, int steps) {
    if(n==0) {
      return steps;
    }
    if(n%2==0) {
      return noOfSteps(n/2,steps+1);
    }
    return noOfSteps(n-1,steps+1);
  }
}
