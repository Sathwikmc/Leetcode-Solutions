class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        fq={}
    
        for i,n in enumerate(nums):
            com=target-n
            if com in fq:
                return [fq[com],i]
        
   
            fq[n]=i