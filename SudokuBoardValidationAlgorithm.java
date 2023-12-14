/*
 Sudoku board validation algorithm
You have been tasked with developing an algorithm to validate a 9 x 9 Sudoku board. Your algorithm needs to verify the validity of the filled cells on the board, adhering to the following conditions:

Every row should contain the numbers 1-9 exactly once, without repetition.
Every column should contain the numbers 1-9 exactly once, without repetition.
Each of the nine 3 x 3 sub-boxes within the grid should contain the numbers 1-9 exactly once, without repetition.

Can you outline an algorithm or a step-by-step approach to determine if the given Sudoku board configuration is valid based on these conditions?

Important Note: Ensure that you save your solution before progressing to the next question and before submitting your answer.

Exercise-1

Input :

9
5 3 . . 7 . . . .
6 . . 1 9 5 . . .
. 9 8 . . . . 6 .
8 . . . 6 . . . 3
4 . . 8 . 3 . . 1
7 . . . 2 . . . 6
. 6 . . . . 2 8 .
. . . 4 1 9 . . 5
. . . . 8 . . 7 9

Output :

YES

Exercise-2

Input:

9
5 3 . . 7 . . . .
5 . . 1 9 5 . . .
. 9 8 . . . . 6 .
8 . . . 6 . . . 3
4 . . 8 . 3 . . 1
7 . . . 2 . . . 6
. 6 . . . . 2 8 .
. . . 4 1 9 . . 5
. . . . 8 . . 7 9

Output:
NO
 */

import java.util.Scanner;
import java.util.Arrays;

public class SudokuBoardValidationAlgorithm{
static int N = 9;
// Function to check if all elements of the board[][] array store value in the range[1, 9]
    static boolean isinRange(int[][] board)
    {
	    // Traverse board[][] array
	    for(int i = 0; i < N; i++) 
	    {
		    for(int j = 0; j < N; j++)
    		{
	    		// Check if board[i][j] lies in the range
		    	if (board[i][j] <= 0 ||board[i][j] > 9)
			    {
				    return false;
			    }
		    }
	    }
	    return true;
    }


    static boolean isValidSudoku(int board[][])
    {
	    // Check if all elements of board[][] stores value in the range[1, 9]
	    if (isinRange(board) == false)
	    {
		    return false;
    	}

	    // Stores unique value from 1 to N
    	boolean[] unique = new boolean[N + 1];

	    // Traverse each row of the given array
	    for(int i = 0; i < N; i++)
	    {
		    // Initialize unique[] array to false
		    Arrays.fill(unique, false);
		    // Traverse each column of current row
		    for(int j = 0; j < N; j++)
		    {
		    	// Stores the value of board[i][j]
			    int Z = board[i][j];
			    // Check if current row stores duplicate value
			    if (unique[Z])
			    {
			    	return false;
			    }
			    unique[Z] = true;
		    }
	    }

	    // Traverse each column of the given array
	    for(int i = 0; i < N; i++) 
	    {
		    // Initialize unique[] array to false
		    Arrays.fill(unique, false);
		    // Traverse each row of current column
		    for(int j = 0; j < N; j++)
		    {
			    // Stores the value of board[j][i]
			    int Z = board[j][i];
			    // Check if current column stores duplicate value
			    if (unique[Z]) 
			    {
			    	return false;
			    }
			    unique[Z] = true;
		    }
	    }

	    // Traverse each block of size 3 * 3 in board[][] array
	    for(int i = 0; i < N - 2; i += 3) 
	    {
	    	// j stores first column of each 3 * 3 block
		    for(int j = 0; j < N - 2; j += 3)
		    {
			    // Initialize unique[] array to false
			    Arrays.fill(unique, false);
			    // Traverse current block
			    for(int k = 0; k < 3; k++)
			    {
				    for(int l = 0; l < 3; l++)
				    {
    					// Stores row number of current block
	    				int X = i + k;
		    			// Stores column number of current block
			    		int Y = j + l;
				    	// Stores the value of board[X][Y]
					    int Z = board[X][Y];
    					// Check if current block stores duplicate value
	    				if (unique[Z])
		    			{
			    			return false;
				    	}
					    unique[Z] = true;
				    }
			    }
		    }
	    }
	    // If all conditions satisfied
    	return true;
    }

    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        int num=in.nextInt();
    
    	int[][] board = new int[num][num];
    	for(int i=0;i<num;i++){
    	    for(int j=0;j<num;j++){
    	        board[i][j]=in.nextInt();
	        }
	    }
        in.close();
	    if (isValidSudoku(board)) 
	    {
		    System.out.println("YES");
	    }
	    else
	    {
		    System.out.println("NO");
	    }
    }
}
                                                                                                                        