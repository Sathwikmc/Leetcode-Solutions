class Solution {
    public int lengthOfLongestSubstring(String s) {
      /* int max=0;
       for(int i=0;i<s.length();i++)
       {  HashSet<Character> set=new HashSet<>();
        for(int j=i;j<s.length();j++)
        {  char ch=s.charAt(j);
           if(set.contains(ch)) break;
          set.add(ch);

           max=Math.max(max,j-i+1);
        }
       }
       return max;*/
       HashSet<Character> set=new HashSet<>();
       int max=0; int i=0;
       for(int j=0;j<s.length();j++)
       {
        while(set.contains(s.charAt(j)))
        {  set.remove(s.charAt(i));
            i++;
        }
        set.add(s.charAt(j));
        max=Math.max(max,j-i+1);
       }
       return max;
    }
}