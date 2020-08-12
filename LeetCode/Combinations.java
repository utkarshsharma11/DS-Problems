class Solution {
      List<List<Integer>> flist;
    boolean visited[];
    public List<List<Integer>> combine(int n, int k) {
        visited = new boolean[n+1];
        flist = new ArrayList<>();
 
        
      compute(n,new ArrayList<Integer>(),k);  
        return flist;
        
        
    }

    public void compute(int n,ArrayList<Integer> list,int k)
    {
        
if(list.size()==k)
{
   
       flist.add(new ArrayList<Integer>(list));
    
    return ;
}
       
           for(int i=n;i>0;i--)
           {
             
          
               list.add(i);
               compute(i-1,list,k);
                list.remove(list.size()-1);
               
           }
              
           
       
       return ;
   } 
}