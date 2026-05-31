class Solution {
    public int strStr(String ha, String ne) {
          if(ne.length() == 0) return 0;
       for(int i=0;i<=ha.length()-ne.length();i++)
       {
        if(ha.substring(i,i+ne.length()).equals(ne))
        {
            return i;
        }
       }
       return -1; 
    }
}