class Solution {
     List<List<Integer>> flist;
    boolean visited[];
    public List<List<Integer>> subsets(int[] nums) {
        visited = new boolean[nums.length];
    flist = new ArrayList<>();
        compute(nums,nums.length,0,new ArrayList<Integer>());
        flist.add(new ArrayList<Integer>());
        return flist;
    }
    
    
    void compute(int[] nums, int n,int s, ArrayList<Integer> list )
    {
        if(s==n)
            return;
       
        for(int i=s;i<n;i++)
        {
        list.add(nums[i]);
        flist.add(new ArrayList<Integer>(list));
        compute(nums,n,i+1,list);
             list.remove(list.size()-1);
        } 
     
            
             
        
        return;
        
        
    }
    
    
}