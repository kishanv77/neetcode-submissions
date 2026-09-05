//Brute Force Approach

class Solution {
  public int GCD1(int n1,int n2) {
    int gcd= 1; //Any two numbers will have atleast gcd=1
    for(int i=1;i<Math.min(n1,n2);i++) {
      if(n1%i==0 && n2%i==0) {
        gcd=i;
      }
    }
    return gcd;
  }
}

//Optimal Approach(Euclidean Algorithm)

class Solution {
  public int gcd1(int n1,int n2) {
    int min= Math.min(n1,n2) 
      while(n1!=n2) {
        if(n1>n2) {
          n1=n1-min;
        }
        else {
          n2= n2-min;
        }
      }
      return n1;
  }
}
      
