class Solution {
    List<List<Integer>> flist;
    boolean visited[];
    public List<List<Integer>> permute(int[] nums) {
     visited = new boolean[nums.length];
        flist = new ArrayList<>();
 
        
      compute(nums,new ArrayList<Integer>());  
        return flist;
    }
   public void compute(int[] nums,ArrayList<Integer> list)
    {
        
if(list.size()==nums.length)
{
   
       flist.add(new ArrayList<Integer>(list));
    
    return ;
}
       
           for(int i=0;i<nums.length;i++)
           {
               if(visited[i]==false)
               {
               visited[i]=true;
               list.add(nums[i]);
               compute(nums,list);
                list.remove(list.size()-1);
              visited[i]=false;
           }
           }
       
       return ;
   } 
}