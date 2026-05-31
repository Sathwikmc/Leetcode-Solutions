class Solution:
    def strStr(self, hay: str, ne: str) -> int:
        for i in range(0,len(hay)-len(ne)+1):
            sub=hay[i:i+len(ne)]
            if sub==ne:
                return i

        return -1
        