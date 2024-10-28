class Solution {
    public int largestAltitude(int[] gain) {
        int maxHeight = 0;
        int prefixSum = 0;
        for(int i = 0; i < gain.length; i++)
        {
            prefixSum+=gain[i];
            maxHeight = Math.max(maxHeight,prefixSum);
        }
        return maxHeight;
    }
}