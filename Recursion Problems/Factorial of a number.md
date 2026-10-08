# Question: Find the Factorial of a Number

Write a program to find the **factorial of a given number `N` using recursion**.

The factorial of a non-negative integer `N` is defined as:

```text
N! = N × (N - 1) × (N - 2) × ... × 2 × 1
```

Also,

```text
0! = 1
```

### Input

A single integer `N`.

### Output

Print the factorial of `N`.

### Example 1

**Input:**
```text
5
```

**Output:**
```text
120
```

### Example 2

**Input:**
```text
0
```

**Output:**
```text
1
```

### Constraints

- `0 ≤ N ≤ 12`
- The solution must use **recursion**.
- Do not use loops.

### Function Signature

```java
static long factorial(int n)
```

### Expected Approach

Identify:

1. **Base condition** — When should the recursion stop?
2. **Recursive relation** — How can `factorial(n)` be expressed using `factorial(n - 1)`?
