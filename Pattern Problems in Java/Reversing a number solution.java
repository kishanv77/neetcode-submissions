class Solution {
  public int reverseNumber(int n) {
    int reverse=0; //Initialize reverse value to 0
    while(n>0) { //Loop for running the condition
      int lastDigit= n%10; // Extract last digit by taking modulo(remainder)
      reverse= reverse * 10 + lastDigit; // Formula
      n= n/10; // Extract first digit by dividing by 10
    } //Continue the loop until n=1
    return reverse; //Return the reversed number
  }
}
