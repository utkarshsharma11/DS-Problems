import java.util.*;

class Solution {
    List<String> flist;
    public List<String> letterCombinations(String digits) {
        //Create arraylist for digits string
    List<Integer>  list = new ArrayList<>();
        //create array for given numbers
    List<String> list1 = new ArrayList<>(Arrays.asList("abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"));
flist = new ArrayList<>();
        if(digits.equals(""))
            return flist;
        //convert string to digit list
for(int i=0;i<digits.length();i++)
{
    list.add(Character.getNumericValue(digits.charAt(i)));

}


    int l=0;
    char arr[] = new char[list.size()];

    compute(list1,list,arr,0,l);

      return flist;




    }
     void compute(List<String> list1, List<Integer> list, char arr[], int k, int l)
    {

        if(k==list.size())
        {
            String s = "";
            for(int i=0;i<list.size();i++)
            s+=arr[i];

            flist.add(s);
            return;
        }
        int h=3;
         //checking for 7 snd 9 button condition
if(list.get(l)==7 ||list.get(l)==9)
    h=4;

        for(int i=0;i<h;i++)
        {
            //getting value(char) at digit number
            arr[k]=list1.get(list.get(l)-2).charAt(i);
            k+=1;
            l+=1;
            compute(list1,list,arr,k,l);
            k-=1;
            l-=1;
        }


        return;

    }




}