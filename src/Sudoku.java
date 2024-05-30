import java.util.HashSet;

public class Sudoku {


    public static void main(String [] strings)
    {

        char[][] board = {
                {'5', '2', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '4'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };

        // Check if the board is valid
        boolean isValid = isValidSudoku(board);
        boolean isHasSetValid=isValidSudokuWithHashSet(board);
        System.out.println("Is the Sudoku board valid? " + isValid+" " +isHasSetValid);
    }
    public static boolean isValidSudoku(char[][] board) {
    boolean [][] row=new boolean[9][9];
    boolean [][] column=new boolean[9][9];
    boolean [][] grid=new boolean[9][9];

    for (int i=0;i<9;i++)
    {
        for(int j=0;j<9;j++)
        {
            if(board[i][j]!='.')
            {
                int num= board[i][j]-'1';  // Convert char '1'-'9' to index 0-8
                int gridIndex=(i/3)*3 + (j/3);
                if(row[i][num] || column [j][num] || grid[gridIndex][num] )
                {
                    return false;
                }
                row[i][num]=true;
                column[j][num]=true;
                grid[gridIndex][num]=true;
            }
        }
    }
    return true;
    }

    public static boolean isValidSudokuWithHashSet(char[][] board)
    {
        HashSet<String> set=new HashSet<>();
        for (int i=0;i<board.length;i++)
        {
            for(int j=0;j<board[0].length;j++)
            {
                char cur=board[i][j];
                if(cur!='.')
                {
                    if(!set.add("row"+i+cur)||
                       !set.add("col"+j+cur)||
                       !set.add("grid"+i/3+j/3+cur))
                    {
                        return false;
                    }
                }
            }
        }
        return true;
    }

}
