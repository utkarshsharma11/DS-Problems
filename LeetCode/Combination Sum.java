class Solution {
    List<List<Integer>> flist;
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
  flist = new ArrayList<>();
        compute(candidates,target,candidates.length,new ArrayList<Integer>());
        return flist;
    }
    
    
    void compute(int[] candidates, int target, int n, ArrayList<Integer> list )
    {
        
        if(target==0)
        {
            flist.add(new ArrayList<Integer>(list));
            
            return;
        }
        if(n<=0 && target >0)
            return;
        
        if(target>=candidates[n-1])
        {
            list.add(candidates[n-1]);
        compute(candidates,target-candidates[n-1],n,list);
             list.remove(list.size()-1);
        } 
        compute(candidates,target,n-1,list);
            
             
        
        return;
        
        
    }
    
    
}