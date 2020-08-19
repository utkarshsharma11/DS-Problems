class Solution{ 
    int res=0,count=0;
    public int uniquePathsIII(int[][] grid) {
        
         for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]==0)
                    count++;
            }}
        
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
               if(grid[i][j]==1 )
                {
                   compute(grid,i,j,0);
                 return res;  
                    
                }
                
            }
        }
        
        return res;
        
        
        
        
    }
    
    void compute(int[][] grid, int i, int j, int c)
    {
        
        if( i>=grid.length || j>=grid[0].length || j<0 || i<0 || grid[i][j]==-1)
        return ;
        
        if(grid[i][j]==2 && c-1==count)
        {
            res++;
            return ;
            }
        if(grid[i][j]==2)
        return;
        
        int temp=grid[i][j];
        
        grid[i][j]=-1;
        compute(grid,i+1,j,c+1);
        compute(grid,i-1,j,c+1);
        compute(grid,i,j-1,c+1);
        compute(grid,i,j+1,c+1);           
        grid[i][j]=temp;
          
        
        return;
        
    }
    
   
}