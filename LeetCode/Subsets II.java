        
class Solution {
	  List<List<Integer>> flist;
	 void compute(int[] nums, int n,int s, ArrayList<Integer> list)
     {
        flist.add(new ArrayList<Integer>(list));

        for(int i=s;i<n;i++)
        {
       
         /// because nums has sorted, so filter i which nums[i] == nums[i - 1]
            if (i > s && nums[i] == nums[i - 1]) {
                continue;
            }  
            list.add(nums[i]); 
            compute(nums,n,i+1,list);
            list.remove(list.size()-1);
        }
    
        return;
   
    }
	 
	 
    public List<List<Integer>> subsetsWithDup(int[] nums) {
       
     Arrays.sort(nums); 
    flist = new ArrayList<>();
        compute(nums,nums.length,0,new ArrayList<Integer>());
        //flist.add(new ArrayList<Integer>());
        return flist;
    }
}