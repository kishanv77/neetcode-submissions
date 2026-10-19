# Count Number of Zeros

**Difficulty:** Easy

## Problem Statement

Given a non-negative integer `n`, count the number of zeros (`0`) present in the number and return the count.

You must solve this problem using recursion without converting the number into a string.

**Note:** If the input number is `0`, count it as one zero.

## Examples

### Example 1

**Input:**
```text
n = 102030
```

**Output:**
```text
3
```

**Explanation:** The number `102030` contains three zeros.

### Example 2

**Input:**
```text
n = 5006
```

**Output:**
```text
2
```

**Explanation:** The number `5006` contains two zeros.

### Example 3

**Input:**
```text
n = 12345
```

**Output:**
```text
0
```

**Explanation:** The number `12345` does not contain any zeros.

### Example 4

**Input:**
```text
n = 0
```

**Output:**
```text
1
```

**Explanation:** The number `0` contains one zero.

### Example 5

**Input:**
```text
n = 1001
```

**Output:**
```text
2
```

**Explanation:** The number `1001` contains two zeros.

## Constraints

- `0 <= n <= 10^9`
- Do not convert the number into a string.
- Use recursion to count the zeros.

## Java Method Signature

```java
class Solution {
    public int countZeros(int n) {

    }
}
```

## Follow-up

Can you solve this problem using recursion with a helper method that keeps track of the count?

## Topics

- Recursion
- Math
- Number Manipulation
