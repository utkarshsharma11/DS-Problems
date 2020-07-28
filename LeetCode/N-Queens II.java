class Solution {
    int count;
    public int totalNQueens(int n) {
        
        count=0;
        char list[][]=new char[n][n];
        
       
        for(int i = 0; i < n; i++) {
            for(int j=0;j<n;j++)
            {
            list[i][j]='.';
        }
        }
        
        
        compute(n,0,list);
     
        return count;
        
    }
    
    
    
    
    public void compute(int n, int col,char list[][])
    {
        
         if(col >= n) {
             
                count++;
                     return;
                }
        
        
        for(int i=0;i<n;i++)
        {
            
            if(isSafe(list,i,col,n))
            {
                 list[i][col]='Q';
                 compute(n,col+1,list);
                 list[i][col]='.';
             }
         }
        
      return ;  
    }
    
    boolean isSafe(char list[][],int i,int j,int n)
    {
        int k,l;
        for(k=i,l=j;k>=0&&l>=0;k--,l--)
        {
            if(list[k][l]=='Q')
                return false;
            
        }
        for(k=i,l=j;k<n&&l>=0;k++,l--)
        {
            if(list[k][l]=='Q')
                return false;
        }
        for(l=j;l>=0;l--)
        {
            if(list[i][l]=='Q')
                return false;
        }
        
       return true; 
        
        
        
        
        
        
    }
    
}
