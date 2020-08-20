class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        
        for(int i=0;i<board.length;i++)
        {
            for(int  j=0;j<board[0].length;j++)
            {
                if(board[i][j]!='.')
                if(!isSafe(board,i,j))
                {
                    return false;
                }
            }


        }
        return true;
    }
   
    boolean isSafe(char[][] board,int i,int j)
        {
            //check for row
            for(int k=0;k<board.length;k++)
            {
                if(board[k][j]==board[i][j] && k!=i)
                    return false;
            }
            //check for col
            for(int k=0;k<board.length;k++)
            {
                if( board[i][k]==board[i][j] && k!=j)
                    return false;
            }

            //check for 3*3 grid
            int s=3;
            int rs=i-i%s;
            int cs=j-j%s;
            //check for entire sub-box
            for(int k=0;k<s;k++)
            {
                for(int l=0;l<s;l++)
                {
                    if(board[k+rs][l+cs]==board[i][j] && (k+rs)!=i && (l+cs)!=j)
                        return false;
                }

            }
            return true;

        }
    
}