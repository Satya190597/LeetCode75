class Solution {
    public void moveZeroes(int[] nums) {
        int snowBallSize = 0;
        for(int index = 0; index < nums.length; index++)
        {
            if(nums[index] == 0)
            {
                snowBallSize++;
                continue;
            }
            if(nums[index]!=0) {
                int temp =  nums[index];
                nums[index] =  nums[index-snowBallSize];
                nums[index-snowBallSize] = temp; 
            }
        }
    }
}