class Solution {
    public int longestSubarray(int[] nums) {
        int slowPointer = 0;
        int result = 0;
        int k = 1;
        for(int fastPointer = 0; fastPointer < nums.length; fastPointer++)
        {
            if(nums[fastPointer]==0)
                k--;
            if(k<0)
            {
                while(nums[slowPointer]!=0)
                    slowPointer++;
                slowPointer++;
                k++;
            }
            result = result > (fastPointer-slowPointer) ? result : fastPointer-slowPointer;
        }
        return result;
    }
}