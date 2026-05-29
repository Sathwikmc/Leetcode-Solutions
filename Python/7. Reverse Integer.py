class Solution:
    def reverse(self, n: int) -> int:
        si=-1 if n<0 else 1
        n=abs(n)
        rev=0
        while n!=0:
            rev=rev*10+n%10
            n//=10
        rev*=si

        if rev>(2**31-1) or rev<-(2**31):
            return 0
        return rev
        