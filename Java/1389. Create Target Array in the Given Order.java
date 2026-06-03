class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> res=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            res.add(index[i],nums[i]);
        }
        int k=0;
        int[] re=new int[res.size()];
        for(int n:res)
        {
            re[k++]=n;
        }
        return re;
    }
}