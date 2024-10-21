class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;
        int max = 0;
        while(left<right)
        {
            int currentVolume = (right-left) * (height[left] <= height[right] ? height[left] : height[right]);
            max = currentVolume >= max ? currentVolume : max;
            if(height[left]<height[right])
                left++;
            else
                right--;
        }
        return max;
    }
}