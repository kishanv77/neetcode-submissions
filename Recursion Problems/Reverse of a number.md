# Reverse Integer

**Difficulty:** Medium

## Problem Statement

Given a signed 32-bit integer `x`, return `x` with its digits reversed.

If reversing `x` causes the value to go outside the signed 32-bit integer range `[-2³¹, 2³¹ - 1]`, return `0`.

Assume the environment does not allow you to store 64-bit integers (signed or unsigned).

## Examples

### Example 1

**Input:**
```text
x = 123
```

**Output:**
```text
321
```

**Explanation:** Reversing the digits of `123` gives `321`.

### Example 2

**Input:**
```text
x = -123
```

**Output:**
```text
-321
```

**Explanation:** Reversing the digits of `-123` gives `-321`.

### Example 3

**Input:**
```text
x = 120
```

**Output:**
```text
21
```

**Explanation:** Reversing the digits of `120` gives `021`, which becomes `21`.

### Example 4

**Input:**
```text
x = 1534236469
```

**Output:**
```text
0
```

**Explanation:** The reversed number exceeds the signed 32-bit integer range, so return `0`.

## Constraints

- `-2³¹ <= x <= 2³¹ - 1`

## Java Method Signature

```java
class Solution {
    public int reverse(int x) {

    }
}
```

## Follow-up

Can you solve the problem without converting the integer into a string?
