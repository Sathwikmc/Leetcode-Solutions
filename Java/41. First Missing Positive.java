class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int n:nums)
        {
            set.add(n);
        }
        int x=1;
        while(set.contains(x))
        {
            x++;
        }
        return x;
        
    }
}