
public class NQueens
 {

    static boolean isSafe(int board[][], int row, int col, int n)
     {
        // Check row on left side
        for (int i = 0; i < col; i++)
         {
            if (board[row][i] == 1)
            {
                return false;
            }
        }

        // Check upper diagonal on left side
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--)
        {
            if (board[i][j] == 1)
            {
                return false;
            }
        }

        // Check lower diagonal on right side
        for (int i = row, j = col; i < n && j >= 0; i++, j--)
         {
            if (board[i][j] == 1)
            {
                return false;
            }
        }

        return true;
    }

    static void solveNQueens(int n)
     {
        int board[][] = new int[n][n];

        // Start placing queens from first column
        if (solveNQueensUtil(board, 0, n))
         {
            System.out.println("Solution found:");
            printBoard(board, n); // Print the solution board
        } else {
            System.out.println("No solution exists");
        }
    }

    static boolean solveNQueensUtil(int board[][], int col, int n)
    {
        if (col >= n)
         {
            return true; 
        }

        for (int i = 0; i < n; i++)
        {
            if (isSafe(board, i, col, n))
             {
                board[i][col] = 1; // Place queen

                // Recursively try placing queens in next column
                if (solveNQueensUtil(board, col + 1, n))
                {
                    return true;
                }

                // Backtrack if placement in next column fails
                board[i][col] = 0; // Remove queen
            }
        }

        return false; // No safe position for queen in current column
    }

    static void printBoard(int board[][], int n)

     {
        for (int i = 0; i < n; i++)
         {
            for (int j = 0; j < n; j++)
             {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args)
     {
        int n = 4;
        solveNQueens(n);
    }
}