class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
     HashMap<Integer,Integer> map=new HashMap<>();
     ArrayList<Integer> l=new ArrayList<>();

     for(int n:nums1)
     {
        map.put(n,map.getOrDefault(n,0)+1);
     }
     for(int n:nums2)
     {
        if(map.containsKey(n)&&map.get(n)>0)
        {
            l.add(n);
            map.put(n,map.getOrDefault(n,0)-1);
        }
     }
     int i=0;
          int[] re=new int[l.size()];
          for(int n:l)
          {
            re[i++]=n;
          }
          return re;
    }
}