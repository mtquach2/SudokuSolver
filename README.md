# SudokuSolver
NAME: Michelle Quach

PROFESSOR: Professor Brizan 

DATE OF COMPLETION: SEPT. 3, 2020

DESCRIPTION OF PROGRAM: In this program, Sudoku.java, the user is to input 9 numbers for 9 rows to make a sudoku board. With the input given by the user, the program will solve the board using recursive backtracking if it is solvable. If it is not solvable, then the program will state so. The recursive backtracking algorithm used to solve the sudoku board is used as so: 1) Find an empty spot indicated with a 0
2) In the empty spot, try each number (1-9) and see if they are "safe" in that spot. "Safe" means that that specific number has not been used in that row, column, or 3x3 square. 
3) Once a number is placed in the empty spot, find the next empty spot and repeat.
4) If all numbers could not be placed in a specific spot, then make that spot empty and go back and retry the previous spot with a different number.
Once the board is solved, it will print the solved board to screen indicating a boarder around the entire board and each 3x3 area. There are also comments in the code that explain each section. Runtime and space complexity will also be commented in the code near the method declaration. 

COMMENTS TO GRADER: When inputing values, enter a space between each value (ex. "1 2 0").
