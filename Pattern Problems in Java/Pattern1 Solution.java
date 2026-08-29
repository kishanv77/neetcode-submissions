class Solution {
  public void printPattern(int n) {
    for(int i=0;i<n;i++) { // Iterate rows from 0 to n
      for(int j=0;j<n;j++) { // Iterate columns from 0 to n (Nested loop concept)
        System.out.print("*"); //Print *
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
        Solution sol = new Solution();
        int N = 5; // Set the size of the square (5x5)
        sol.pattern1(N); // Call the function to print the pattern
    }
}

    
