class Solution {
    public int longestOnes(int[] nums, int k) {
        int start = 0;
        int end = 0;
        int count = 0;
        int max = 0;
        int kcount = 0;
        while(end<nums.length)
        {
            if(nums[end]==1)
            {
                end++;
                count++;
            }
            else
            {
                if(kcount==k)
                {
                    max = max > count ? max : count;
                    while(nums[start]!=0)
                    {
                        start++;
                        count--;
                    }
                    start++;
                    kcount--;
                    count--;
                }
                kcount++;
                end++;
                count++;
            }
        }
        max = max > count ? max : count;
        return max;
    }
}