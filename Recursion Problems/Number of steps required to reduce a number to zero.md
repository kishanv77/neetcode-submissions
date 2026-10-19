# Number of Steps to Reduce a Number to Zero

**Difficulty:** Easy

## Problem Statement

Given a non-negative integer `num`, return the number of steps required to reduce it to zero.

In one step:

- If the current number is even, divide it by `2`.
- If the current number is odd, subtract `1` from it.

Repeat the process until the number becomes `0`.

## Examples

### Example 1

**Input:**
```text
num = 14
```

**Output:**
```text
6
```

**Explanation:**

Step-by-step process:

1. `14` is even → `14 / 2 = 7`
2. `7` is odd → `7 - 1 = 6`
3. `6` is even → `6 / 2 = 3`
4. `3` is odd → `3 - 1 = 2`
5. `2` is even → `2 / 2 = 1`
6. `1` is odd → `1 - 1 = 0`

The number reaches zero in **6 steps**.

### Example 2

**Input:**
```text
num = 8
```

**Output:**
```text
4
```

**Explanation:**

1. `8` is even → `8 / 2 = 4`
2. `4` is even → `4 / 2 = 2`
3. `2` is even → `2 / 2 = 1`
4. `1` is odd → `1 - 1 = 0`

The number reaches zero in **4 steps**.

### Example 3

**Input:**
```text
num = 123
```

**Output:**
```text
12
```

**Explanation:** Following the given rules, it takes 12 steps to reduce `123` to zero.

### Example 4

**Input:**
```text
num = 0
```

**Output:**
```text
0
```

**Explanation:** The number is already zero, so no steps are required.

## Constraints

- `0 <= num <= 10^6`

## Java Method Signature

```java
class Solution {
    public int numberOfSteps(int num) {

    }
}
```

## Follow-up

Can you solve this problem using recursion instead of a loop?

## Topics

- Math
- Bit Manipulation
- Recursion
