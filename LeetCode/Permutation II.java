class Solution {
    List<List<Integer>> flist;
    boolean visited[];
    public List<List<Integer>> permuteUnique(int[] nums) {
        
     visited = new boolean[nums.length];
    flist = new ArrayList<>();
        Arrays.sort(nums);
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
               if(!visited[i])
               {
                   
               if (i > 0 && nums[i - 1] == nums[i] && !visited[i - 1]) continue;
            
            list.add(nums[i]);
            visited[i] = true;
            compute(nums,list);
            list.remove(list.size() - 1);
            visited[i] = false; 
            
           }
           }
       
       return ;
   } 
}