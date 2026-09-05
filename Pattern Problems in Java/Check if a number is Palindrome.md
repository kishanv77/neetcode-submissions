Check if a number is Palindrome or Not

Problem Statement: Given an integer N, return true if it is a palindrome else return false.
A palindrome is a number that reads the same backward as forward. For example, 121, 1331, and 4554 are palindromes because they remain the same when their digits are reversed.

Algorithm / Intuition
To check if a number is a palindrome, we can use the algorithm created in Extract Digits as now we extract the digits of the number to create a reversed number.

We then compare the reversed number with the original number. If they are equal, the original number is a palindrome. If they are not equal the original number is not a palindrome.

Algorithm

1.Initialise an integer revNum to 0. This variable will store the reverse of the number.

2.Make a duplicate of the original number and store it in an integer dup for later comparison.

3.Run a while loop with the condition n>0 to reverse the number and at each iteration

4.Get the last digit of n by using the modulus operator % with 10 and store it in a temporary variable ld.

5.Update the revNum by multiplying it by 10 and adding the last digit ld.

6.Update n by integer division with 10 effectively removing the last digit.

7.After the loop, check if the original number dup is equal to the reversed number revNum.

8.If they are equal, return true indicating the number is a palindrome.

9.If they are not equal, return false indicating that the number is not a palindrome.
