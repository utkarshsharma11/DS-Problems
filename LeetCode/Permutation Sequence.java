class Solution {
    String s="";
    int c=0;
     boolean visited[];
    public String getPermutation(int n, int k) {
        
   visited = new boolean[n+1];
     
 
        
      compute(n,new ArrayList<Character>(),k);  
        return s;
    }
   public boolean compute(int n,ArrayList<Character> list,int k)
    {
      
       
if(list.size()==n)
{
   
       c++;
    
    if(k==c)
    {
   for(int i=0;i<list.size();i++)
                s+=list.get(i);
    return true;
    }
    return false ;
}
       
           for(int i=1;i<=n;i++)
           {
               if(visited[i]==false)
               {
               visited[i]=true;
               list.add((char)(i+'0'));
               if(compute(n,list,k))
                   return true;
                   else{
                list.remove(list.size()-1);
              visited[i]=false;
                   }
           }
           }
       
       return false;
   } 
}