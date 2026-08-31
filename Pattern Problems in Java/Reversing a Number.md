Reverse Digits of A Number

Problem Statement: Given an integer N return the reverse of the given number.

Note: If a number has trailing zeros, then its reverse will not include them. For e.g , reverse of 10400 will be 401 instead of 00401.

Algorithm
We know that extracting digits of a number can be done by repeatedly taking modulo 10 and dividing by 10. Now, instead of just extracting digits, if we build a new number by appending these digits in reverse order, we effectively reverse the number. Each new digit becomes the least significant digit of the reversed number by multiplying the current reversed value by 10 before adding the digit.

1.Initialize a variable to store the reversed number as 0.

2.Loop while the original number is greater than 0.

3.Extract the last digit by performing modulo 10.

4.Multiply the reversed number by 10 and add the extracted digit.

5.Remove the last digit from the original number using integer division by 10.

6.Continue this process until the original number becomes 0.

7.Return the reversed number.
