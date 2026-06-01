class Solution:
    def minimumCost(self, cost: List[int]) -> int:
        cost.sort(reverse=True)
        sm=0
        count=0
        for i in range(len(cost)):
            count+=1
            if count%3!=0:
                sm+=cost[i]
        return sm
        