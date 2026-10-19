# Palindrome Number

**Difficulty:** Easy

## Problem Statement

Given an integer `x`, return `true` if `x` is a palindrome, and `false` otherwise.

A **palindrome number** is a number that reads the same forward and backward.

For example, `121` is a palindrome because it reads the same forward and backward. However, `123` is not a palindrome because its reverse is `321`.

## Examples

### Example 1

**Input:**
```text
x = 121
```

**Output:**
```text
true
```

**Explanation:** Reading from left to right and right to left gives `121`.

### Example 2

**Input:**
```text
x = -121
```

**Output:**
```text
false
```

**Explanation:** Reading from right to left, the number becomes `121-`. Therefore, it is not a palindrome.

### Example 3

**Input:**
```text
x = 10
```

**Output:**
```text
false
```

**Explanation:** Reversing `10` gives `01`, which is interpreted as `1`. Therefore, it is not a palindrome.

### Example 4

**Input:**
```text
x = 0
```

**Output:**
```text
true
```

**Explanation:** A single-digit number reads the same forward and backward.

## Constraints

- `-2³¹ <= x <= 2³¹ - 1`
- The input is a signed 32-bit integer.

## Java Method Signature

```java
class Solution {
    public boolean isPalindrome(int x) {

    }
}
```

## Follow-up

Can you solve the problem without converting the integer into a string?

## Topics

- Math
- Recursion
- Number Manipulation
