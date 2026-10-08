# Question: Find the Sum of Digits of a Number

Write a program to find the **sum of all digits of a given number using recursion**.

For example, if the given number is `12345`, the sum of its digits is:

```text
1 + 2 + 3 + 4 + 5 = 15
```

### Input

A single integer `N`.

### Output

Print the sum of all the digits of `N`.

### Example 1

**Input:**
```text
12345
```

**Output:**
```text
15
```

### Example 2

**Input:**
```text
987
```

**Output:**
```text
24
```

### Example 3

**Input:**
```text
500
```

**Output:**
```text
5
```

### Constraints

- `0 ≤ N ≤ 10^9`
- The solution must use **recursion**.
- Do not use loops.

### Function Signature

```java
static int sumOfDigits(int n)
```

### Expected Approach

Identify:

1. **Base condition** — When should the recursion stop?
2. **Recursive relation** — Use the last digit of the number and recursively process the remaining digits.

Useful operations:

```text
n % 10  → gives the last digit
n / 10  → removes the last digit
```

For example:

```text
sumOfDigits(123)
= 3 + sumOfDigits(12)
= 3 + 2 + sumOfDigits(1)
= 3 + 2 + 1 + sumOfDigits(0)
```
