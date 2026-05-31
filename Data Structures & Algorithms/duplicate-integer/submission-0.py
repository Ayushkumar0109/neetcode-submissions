class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        a=set()
        for val in nums:
            if val in a:
                return True
            else:
                a.add(val)
        return False            

        