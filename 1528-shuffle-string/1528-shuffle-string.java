class Solution {
    public String restoreString(String s, int[] indices) {
      int n=s.length();
      char c[]=new char[n];
      for(int i=0;i<n;i++){
        char ch=s.charAt(i);
        int index=indices[i];
        c[index]=ch;
      } 
      StringBuilder sb=new StringBuilder ();
      for(int i=0;i<n;i++){
        sb.append(c[i]);
      }
      return sb.toString();
    }
}