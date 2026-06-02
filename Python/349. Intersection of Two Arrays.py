class Solution:
    def intersection(self, nums1: List[int], nums2: List[int]) -> List[int]:
        # st1=set()
        # st2=set()
        # for n in nums1:
        #     st1.add(n)
        # for n in nums2:
        #     if n in st1:
        #         st2.add(n)
        # return list(st2)
        return list(set(nums1)&set(nums2))