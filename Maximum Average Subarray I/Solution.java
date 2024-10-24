class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double result = Integer.MIN_VALUE;
        double sum = 0;
        int window  = k;
        int start = 0;
        int end = k-1;
        for(int i = 0; i <= end; i++)
        {
            sum+=nums[i];
        }
        result = sum>result ? sum : result;
        while(end<nums.length-1)
        {
            sum-=nums[start];
            sum+=nums[end+1];
            result = sum>result ? sum : result;
            start++;
            end++;
        } 
        return result/k;
    }
}