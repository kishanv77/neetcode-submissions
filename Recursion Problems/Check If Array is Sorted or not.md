# Check if an Array Is Sorted Using Recursion

## Problem Statement

Given an array of integers, write a recursive function to check whether the array is sorted in **non-decreasing order**.

An array is sorted in non-decreasing order if every element is less than or equal to the next element.

You must solve this problem using **recursion without using loops**.

## Examples

**Example 1:**

**Input:**
```text
arr = [1, 2, 3, 4, 5]
```

**Output:**
```text
true
```

**Explanation:** The array is sorted in non-decreasing order.

---

**Example 2:**

**Input:**
```text
arr = [1, 3, 2, 4, 5]
```

**Output:**
```text
false
```

**Explanation:** The element `3` is greater than the next element `2`, so the array is not sorted.

---

**Example 3:**

**Input:**
```text
arr = [5]
```

**Output:**
```text
true
```

**Explanation:** An array containing a single element is always sorted.

---

**Example 4:**

**Input:**
```text
arr = [1, 2, 2, 3, 4]
```

**Output:**
```text
true
```

**Explanation:** Equal adjacent elements are allowed because the array must be sorted in non-decreasing order.

## Function Signature

```cpp
bool isSorted(int arr[], int n);
```

## Constraints

- `1 <= n <= 10^5`
- `-10^9 <= arr[i] <= 10^9`
- The solution must use recursion.
- Do not use loops.
- The array may contain duplicate elements.

## Expected Complexity

- **Time Complexity:** `O(n)`
- **Auxiliary Space Complexity:** `O(n)` in the worst case due to the recursion stack.

## Hint

Compare the first two elements.

- If `arr[0] > arr[1]`, return `false`.
- Otherwise, recursively check the remaining array.
- If only one element remains, return `true`.

## Your Task

Implement the recursive function `isSorted()` to determine whether the given array is sorted in non-decreasing order.
