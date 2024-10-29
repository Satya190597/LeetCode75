class Solution {
    public int pivotIndex(int[] nums) {
        // 1. Find Total Sum.
        int totalPrefixSum = 0;
        for(int i = 0; i < nums.length; i++)
        {
            totalPrefixSum+=nums[i];
        }
        // 2. Find Pivot Index.
        int prefixSum = 0;
        for(int i = 0; i < nums.length; i++)
        {
            prefixSum+= nums[i];
            if(prefixSum-nums[i] == totalPrefixSum-prefixSum)
                return i;
        }
        return -1;
    }
}