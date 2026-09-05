Find GCD of two numbers


Problem Statement: Given two integers N1 and N2, find their greatest common divisor.

Brute Force Approach 

Algorithm
Intuition:
The GCD of two numbers is the largest number that divides both of them without leaving a remainder. We iterate through all numbers from 1 up to the minimum of the two input numbers, checking if each number is a common factor of both input numbers.

If a number is a common factor, we update our gcd variable to that number. This process continues until we have iterated through all possible common factors. Finally, we return the gcd variable, which will hold the greatest common divisor of the two input numbers.

Algorithm:

Step 1: Initialise a variable gcd to 1. This variable will store the greatest common divisor of the input numbers n1 and n2.

Step 2: Iterate from 1 to the minimum of n1 and n2.

We start from 1 because the GCD of any two numbers is at least 1, and it cannot be greater than the smaller of the two numbers.

Step 3: At each iteration, if i is a common factor of both n1 and n2 update the gcd variable to i. We keep updating gcd as long as we find common factors.

Step 4: After the iteration, the GCD variable will store the greatest common divisor of n1 and n2. Return this value as the output of the function. 

Optimal Approach(Euclidean Algorithm)

Algorithm
Euclidean Algorithm:
The Euclidean Algorithm is a method for finding the greatest common divisor (GCD) of two numbers. It operates on the principle that the GCD of two numbers remains the same even if the smaller number is subtracted from the larger number.

To find the GCD of n1 and n2 where n1 > n2:

Repeatedly subtract the smaller number from the larger number until one of them becomes 0.
Once one becomes 0, the other is the GCD of the original numbers.
Example: n1 = 20, n2 = 15

gcd(20, 15) = gcd(20 - 15, 15) = gcd(5, 15)
gcd(5, 15) = gcd(15 - 5, 5) = gcd(10, 5)
gcd(10, 5) = gcd(10 - 5, 5) = gcd(5, 5)
gcd(5, 5) = gcd(5 - 5, 5) = gcd(0, 5)
Hence, return 5 as the GCD.

