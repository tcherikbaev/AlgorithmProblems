public class Sudoku {


    public static void main(String [] strings)
    {

    }
    public static boolean isValidSudoku(char[][] board) {
    boolean [][] row=new boolean[9][9];
    boolean [][] column=new boolean[9][9];
    boolean [][] grid=new boolean[9][9];

    for (int i=0;i<board.length;i++)
    {
        for(int j=0;j<board[i].length;j++)
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
                column[num][j]=true;
                grid[gridIndex][num]=true;
            }
        }
    }
    return true;
    }


}
