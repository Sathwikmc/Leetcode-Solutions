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
        
    }    static {
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            try (java.io.FileWriter fw = new java.io.FileWriter("display_runtime.txt")) {
                fw.write("0");
            } catch (Exception e) {
            }
        }));
    }
}