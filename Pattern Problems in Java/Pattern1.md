<img width="566" height="582" alt="Screenshot 2026-08-29 171850" src="https://github.com/user-attachments/assets/48c2e192-c584-422f-83b0-05bd62c2d6ce" />

Algorithm
Intuition: The task is to print a square pattern of stars. Since the number of rows and columns are equal, we can use two nested loops: the outer one for rows and the inner one for printing N stars per row.

Take an integer N as input to define the size of the square.
Use a loop from 0 to N-1 to represent each row.
Inside that loop, use another loop from 0 to N-1 to print stars in the current row.
Print "* " during each inner loop iteration to form the row.
After each inner loop completes, move to the next line.

Complexity Analysis

Time Complexity: O(N²), since we print N stars for each of the N rows.

Space Complexity: O(1), no additional space is used apart from loop variables.
