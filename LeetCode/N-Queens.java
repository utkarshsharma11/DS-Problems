class Solution {
    List<List<String>> flist;
    public List<List<String>> solveNQueens(int n) {
        
        flist = new ArrayList<>();
        char list[][]=new char[n][n];
        
        //ArrayList<StringBuilder> list = new ArrayList<StringBuilder>();
        for(int i = 0; i < n; i++) {
            for(int j=0;j<n;j++)
            {
            list[i][j]='.';
        }
        }
        
        
        compute(n,0,list);
     
        return flist;
        
    }
    
    
    
    
    public void compute(int n, int col,char list[][])
    {
        
         if(col >= n) {
             
                List<String> solution = new ArrayList<>();
              StringBuilder sb1; 
        for(int i=0;i<n;i++)
        {
            sb1= new StringBuilder("");
        for(int j=0;j<n;j++)
        {
            sb1.append(list[i][j]);
            
            
        }
          solution.add(sb1.toString());  
        
        }
             
                  /*  for(char sb[] : list) {
                        solution.add(sb.toString());
                    }*/
             
                    flist.add(solution);
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
