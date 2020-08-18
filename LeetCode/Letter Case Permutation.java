class Solution {
    List<String> flist;
    public List<String> letterCasePermutation(String S) {
        flist = new ArrayList<>();
        compute(S,0,new char[S.length()]);
        return flist;
    }
    
    
    void compute(String s , int i, char list[])
    {
        if(i==s.length())
        { 
            flist.add(new String(list));
            return;
        }
        
        if(!Character.isDigit(s.charAt(i))){
        list[i]=Character.toLowerCase(s.charAt(i));
        compute(s,i+1,list);
            
        list[i]=Character.toUpperCase(s.charAt(i));
        compute(s,i+1,list); 
         
        }
        else
        {
             list[i]=s.charAt(i);
        compute(s,i+1,list);
        
        }return;
        
    }
    
}