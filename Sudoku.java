import java.util.*;

public class Sudoku 
{
	private int [][] board;
	public static final int SIZE = 9;
	public boolean valid = true;
	public Sudoku(){}

	public void enterBoard()
	{
		board = new int[9][9];
		Scanner scan = new Scanner(System.in);
		int temp = 0;
		for (int row = 0; row < SIZE; row++)
		{
			System.out.print("Please enter 9 integers for row " + (row + 1) + " with a space between each integer: ");
			for (int col = 0; col < SIZE; col++)
			{
				temp = scan.nextInt();

				if (safe(board, row, col, temp))
				{
					valid = true;
					board[row][col] = temp;
				}
				else
				{
					valid = false;
				}
			}
		}
		System.out.println();

	}

	public boolean safeRow(int [][] board, int row, int x)
	{
		boolean flag = true;

		for (int i = 0; i < SIZE; i++){
			if (board[row][i] == x){
				flag = false;	//if the number x is already in the row return false
			}
		}
		return flag;
	}

	public boolean safeCol(int [][] board, int col, int x)
	{	
		boolean flag = true;

		for (int i = 0; i < SIZE; i++)
		{
			if (board[i][col] == x)
			{
				flag = false;	//if the number x is already in the col return false
			}
			
		}
		return flag;

	}

	public boolean safe3x3(int [][] board, int row, int col, int x)
	{
		int boxRow = row - row % 3;	// finds beginning of box row
		int boxCol = col - col % 3; //finds beginning of box col 
		boolean flag = true;

		for (int i = boxRow; i < boxRow + 3; i++)	//for every row in the 3x3
		{
			for (int j = boxCol; j < boxCol + 3; j++)	//for every col in the 3x3
			{
				if (board[i][j] == x)
				{
					flag =  false;
				}
				
			}
		}
		return flag;
	}

	public boolean safe(int[][] board, int row, int col, int x)
	{
		return safeRow(board, row, x) && safeCol(board, col, x) && safe3x3(board, row, col, x);
	}

	public boolean solve(int[][] board)
	{
		for (int row = 0; row < SIZE; row++){
			for (int col = 0; col < SIZE; col++){
				if (board[row][col] == 0){	//if the space is empty try numbers
				
					for (int x = 1; x <= 9; x++){	//try numbers 1-9 until one works
						
						if (safe(board, row, col, x) == true){	//if the number is safe
							
							board[row][col] = x;	//place that number 
							
							if (solve(board)){
								return true;
							}
							else{
								board[row][col] = 0;	//backtracking 
							}
						}
					}
					return false;	// returns false if we cannot place a number 
				}
			}
		}
		return true;	//if code gets here sudoku is solved 
	}

	public void printBoard(int[][] board)
	{
		for (int row = 0; row < SIZE; row++)
		{
			if (row % 3 == 0)
			{
				System.out.println("   ---------------------");	//after every 3 rows print - to separate box
			}

			for (int col = 0; col < SIZE; col++)
			{
				if (col == 0)
				{
					System.out.print(" | " + board[row][col] + " "); 
				}
				else if ((col+1) % 3 == 0)
				{
					System.out.print(board[row][col] + " | ");	//after every 3 cols print | to separate box
				}
				else
				{
					System.out.print(board[row][col] + " ");
				}
			}
			System.out.println();
		}
		System.out.println("   ---------------------"); //print - on bottom 

	}

	public static void main(String[] args)
	{

		Sudoku sudoku = new Sudoku();
		
		sudoku.enterBoard();
		
		if(sudoku.solve(sudoku.board) && sudoku.valid)
		{
			sudoku.printBoard(sudoku.board);
		}
		else
		{
			System.out.println("Unsolvable board");
		}
		
		
		
		
	}
}
