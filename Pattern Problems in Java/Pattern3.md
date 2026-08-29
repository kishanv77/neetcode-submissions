<img width="821" height="566" alt="Screenshot 2026-08-29 180404" src="https://github.com/user-attachments/assets/27e0d049-9e9c-4301-b573-26b64ff4c7ac" />

Algorithm
We need to print a right-angled triangle where each row contains numbers starting from 1 up to the row number. So, the first row has 1, the second row has 1 2, the third row has 1 2 3, and so on until N.

Use an outer loop (i) from 1 to N for rows.
For each row, use an inner loop (j) from 1 to i to print numbers.
Each row prints numbers starting from 1 up to the current row index.
After printing each row, move to the next line.

Complexity Analysis

Time Complexity: O(N²), because the outer loop runs N times and the inner loop runs up to i times for each row.
Space Complexity: O(1), since only loop variables are used.
