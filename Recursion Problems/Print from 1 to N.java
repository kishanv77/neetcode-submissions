class Solution {
  static void print(int n) {
    //Base Condition
    if(n<1) {
      return;
    }
    print(n-1);
    System.out.println(n);
  }

  //Case 2
  static void printNto1(int n) {
    //Base Condition
    if(n<1) {
      return;
    }
    System.out.println(n);
    printNto1(n-1);
  }

  //Case 3
 static void printBoth(int n) {
    if(n < 1) {
        return;
    }

    System.out.println(n);
    printBoth(n - 1);
    System.out.println(n);
  }
}
    
