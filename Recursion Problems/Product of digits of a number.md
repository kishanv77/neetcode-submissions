# Question: Find the Product of Digits of a Number

Write a program to find the **product of all digits of a given number using recursion**.

For example, if the given number is `1234`, the product of its digits is:

```text
1 × 2 × 3 × 4 = 24
```

### Input

A single integer `N`.

### Output

Print the product of all the digits of `N`.

### Example 1

**Input:**
```text
1234
```

**Output:**
```text
24
```

### Example 2

**Input:**
```text
567
```

**Output:**
```text
210
```

### Example 3

**Input:**
```text
500
```

**Output:**
```text
0
```

### Example 4

**Input:**
```text
9
```

**Output:**
```text
9
```

### Constraints

- `0 ≤ N ≤ 10^9`
- The solution must use **recursion**.
- Do not use loops.

### Function Signature

```java
static int productOfDigits(int n)
```

### Expected Approach

Identify:

1. **Base condition** — When should the recursion stop?
2. **Recursive relation** — Extract the last digit and multiply it with the product of the remaining digits.

Useful operations:

```text
n % 10  → gives the last digit
n / 10  → removes the last digit
```

For example:

```text
productOfDigits(123)
= 3 × productOfDigits(12)
= 3 × 2 × productOfDigits(1)
= 3 × 2 × 1 × productOfDigits(0)
```
