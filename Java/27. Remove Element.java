class Solution {
    public int removeElement(int[] nums, int val) {
        List<Integer> l=new ArrayList<>();
        for(int n:nums)
        {
            if(n!=val)
            {
                l.add(n);
            }
        }
        int i=0;
        for(int n1:l)
        {
            nums[i++]=n1;
        }
        return l.size();
        
    }    
}
