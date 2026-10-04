class Solution {
  public void printPattern(int n) {
    for(int row=1; row<= 2 *n -1; row++) {
      int totalCols= row>n ? 2* n - row: row;
      for(int col=1; col<= totalCols; col++) {
        System.out.print("*");
      }
      System.out.println(" ");
    }
  }
}
