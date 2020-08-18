class Solution {
     boolean res;
    boolean test[][];
    public boolean exist(char[][] board, String word) {
        res=false;
        test=new boolean[board.length][board[0].length];
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board[0].length;j++)
            {
                if(word.charAt(0)==board[i][j] && compute(board,word,i,j,0))
                {

                    return true;
                    
                }
                
            }
        }
        
        return false;
        
        
        
        
    }
    
    boolean compute(char[][] board, String word,int i, int j,int index)
    {
        if(index>=word.length())
        {
           
            return true;
            
        }
        
        if( i>=board.length || j>=board[0].length || j<0 || i<0 || word.charAt(index) !=board[i][j])
        return false;
        
        char temp=board[i][j];
        board[i][j]='*';
        
        if(
        compute(board,word,i+1,j,index+1)||
        compute(board,word,i-1,j,index+1)||
        compute(board,word,i,j-1,index+1)||
        compute(board,word,i,j+1,index+1)
        )
             return true; 
            
            board[i][j]=temp;
          
        
        return false;
        
    }
    
    
    
    
    
}