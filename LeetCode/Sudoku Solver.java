class Solution {
    public void solveSudoku(char[][] board) {
        
            
   compute(board);

    }
       boolean compute(char[][] board)
    {
        int row = -1; 
        int col = -1; 
            boolean isEmpty = true; 
           int i=0,j=0;
         //find i,j for blank cell
         for(  i=0;i<board.length;i++)
        {
             for(  j=0;j<board[0].length;j++)
         { 
             if(board[i][j]=='.')
            {
                 row=i;
                 col=j;
           // we still have some remaining 
                    // missing values in Sudoku 
                    isEmpty = false; 
                    break; 
                } 
            } 
            if (!isEmpty) { 
                break; 
            } 
        } 
    
           
         //check for boundry condition(base codition)
            if(i==board.length && j==board[0].length)
                return true;
       
        
        //Now try to fill from 1 to 9 (one by one) into every cell
        for(int c=1;c<=9;c++)
        {
            if(isSafe(board,row,col,(char)(c+'0')))
            {
                board[i][j]=(char)(c+'0');
                if(compute(board))return true;
                else
                board[i][j]='.';    
            }
            
        }
           return false;
     }
    
    boolean isSafe(char[][] board,int i,int j,char c)
    {
        //check for row
        for(int k=0;k<board.length;k++)
        {
            if(board[k][j]==c ||board[i][k]==c )
                return false;
        }
       
        int s=(int)Math.sqrt(board.length);
        int rs=i-i%s;
        int cs=j-j%s;
        //check for entire sub-box
        for(int k=0;k<s;k++)
        {
            for(int l=0;l<s;l++)
            {
                if(board[k+rs][l+cs]==c)
                return false;      
            }
            
        }
        
        return true;
        
    }
    
    
}