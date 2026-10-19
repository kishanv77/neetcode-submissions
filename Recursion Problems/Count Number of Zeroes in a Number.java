class Solution {
  public static int numberOfZeroes(int n,int count) {  
    //Pass count=0 initially
    if(n==0) {  //Base Condition
      return count;
    }
    int rem= n%10;
    if(rem==0) {
      count++;
    }
    return numberOfZeroes(n/10,count);
  }
}
    
