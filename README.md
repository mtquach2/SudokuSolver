# SudokuSolver
NAME: Michelle Quach

PROFESSOR: Professor Brizan 

DATE OF COMPLETION: SEPT. 3, 2020

DESCRIPTION OF PROGRAM: In this program, Sudoku.java, the user is to input 9 numbers for 9 rows to make a sudoku board. With the input given by the user, the program will solve the board using recursive backtracking if it is solvable. If it is not solvable, then the program will state so. The recursive backtracking algorithm used to solve the sudoku board is used as so: 1) Find an empty spot indicated with a 0
2) In the empty spot, try each number (1-9) and see if they are "safe" in that spot. "Safe" means that that specific number has not been used in that row, column, or 3x3 square. 
3) Once a number is placed in the empty spot, find the next empty spot and repeat.
4) If all numbers could not be placed in a specific spot, then make that spot empty and go back and retry the previous spot with a different number.
Once the board is solved, it will print the solved board to screen indicating a boarder around the entire board and each 3x3 area. There are also comments in the code that explain each section. 

RUNTIME AND SPACE COMPLEXITY:
Runtime and space complexity will also be commented in the code near the method declaration. 

enterBoard(): Runtime - O(n^2) because there is nested for loop that run n times. 
safeRow(): Runtime - O(n) because there is a for loop that runs n times. 
safeCol(): Runtime - O(n) because there is a for loop that runs n times.
safe3X3(): Runtime - O(n^2) because there is nested for loop that run n times. 
safe(): Runtime - O(n^2) because the calls of each method end up being n^2 + 2n but since it is big O notation we use the biggest of the functions.
solve(): Runtime - O(n!) because there is a triple nested loop that runs n times but there is also recursive backtracking that continues to be called until the last empty cell of the board. 
printBoard(): Runtime - O(n^2) because there is nested for loop that run n times. 
main(): Runtime - O(n!) because it is calling each funtion including the solve function which is O(n!). 

Space complexity is O(1) because there are only temporary variables and the only declaration there is in the program is an array for the sudoku board but it has a constant size of 81 integers. 

COMMENTS TO GRADER: When inputing values, enter a space between each value (ex. "1 2 0").
