class Solution:
    def firstMissingPositive(self, nums: List[int]) -> int:
        st=set()

        for n in nums:
            st.add(n)
        
        x=1
        while x in st:
            x+=1

        return x