class Solution:
    def thirdMax(self, nums: List[int]) -> int:
        st=list(set(nums))
        st.sort()
        if len(st)>2:
            return st[-3]
        else:
            return st[-1]