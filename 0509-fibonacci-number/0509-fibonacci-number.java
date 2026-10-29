class Solution {
    public int fib(int n) { 
         if(n==0)
         {
             return 0;
         }
     else if(n==1)
         {
            return 1;
        }
         else 
        {
            return fib(n-2)+fib(n-1);
        }
        //  ArrayList <Integer> ans=new ArrayList <>();
        // for(int i=1;i<n;i++)
        //  {
        //     ans.add(fib(i));
        //     return ans;
        // }
    }
}