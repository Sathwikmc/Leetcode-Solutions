class Solution:
    def intersect(self, nums1: List[int], nums2: List[int]) -> List[int]:
        fq=Counter(nums1)
        res=[]

        for n in nums2:
            if fq[n]>0:
                res.append(n)
                fq[n]-=1
        return res
        