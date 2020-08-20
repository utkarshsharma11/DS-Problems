class Solution {
    boolean visited[];
    int count;
    List<List<Integer>> flist;
    public int numSquarefulPerms(int[] A) {
        visited = new boolean[A.length];
            count=0;
            int n=A.length;
            flist = new ArrayList<>();
            compute(n,new ArrayList<>(),A,0);
            return count;
    }

  public  void compute(int n,ArrayList<Integer> list,int A[],int c)
        {

            if(c == n) {
                
                 if(!flist.contains(list))
                 {
                     flist.add(new ArrayList<>(list));
   
                count++;
                 }
                return;
            }


            for(int i=0;i<n;i++)
            {
                if(isSafe(A,i,list) && visited[i]==false)
                {
                    //check for repetitive num
                      if (i > 0 && A[i - 1] == A[i] && !visited[i - 1]) continue;
                    visited[i]=true;
                    list.add(A[i]);
                    compute(n,list,A,c+1);
                    list.remove(list.size()-1);
                    visited[i]=false;
                }
            }

            return ;
        }

         boolean isSafe(int A[],int i,ArrayList<Integer> list)
        {
             
            if(list.size()==0)
                return true;

             
            double x = A[i]+list.get(list.size()-1);

            // finding the square root of given number
            double sq = Math.sqrt(x);

            /* Math.floor() returns closest integer value, for
             * example Math.floor of 984.1 is 984, so if the value
             * of sq is non integer than the below expression would
             * be non-zero.
             */
            boolean res=(sq - Math.floor(sq)) == 0;
            return ((sq - Math.floor(sq)) == 0);
        }

   }

