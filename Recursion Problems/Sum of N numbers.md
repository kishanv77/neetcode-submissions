# Question: Find the Sum of N Numbers

Write a program to find the **sum of the first `N` natural numbers using recursion**.

The sum of the first `N` natural numbers is:

```text
1 + 2 + 3 + ... + N
```

### Input

A single integer `N`.

### Output

Print the sum of the first `N` natural numbers.

### Example 1

**Input:**
```text
5
```

**Output:**
```text
15
```

### Example 2

**Input:**
```text
10
```

**Output:**
```text
55
```

### Constraints

- `1 ≤ N ≤ 10^5`
- The solution must use **recursion**.
- Do not use loops.

### Function Signature

```java
static long sum(int n)
```

### Expected Approach

Identify:

1. **Base condition** — What should the function return when the recursion reaches its stopping point?
2. **Recursive relation** — Express `sum(n)` in terms of `sum(n - 1)`.

For example:

```text
sum(N) = N + sum(N - 1)
```
