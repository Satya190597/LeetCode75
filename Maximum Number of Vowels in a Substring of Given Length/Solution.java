class Solution {
    public int maxVowels(String s, int k) {
        int start = 0;
        int end = k - 1;
        int[] alphabets = new int[26];
        for (int i = start; i <= end; i++) {
            alphabets[s.charAt(i) - 'a'] += 1;
        }
        int result = findMaxVowels(alphabets);
        while (end < s.length() - 1) {
            alphabets[s.charAt(start) - 'a'] -= 1;
            alphabets[s.charAt(end+1) - 'a'] += 1;
            int sum = findMaxVowels(alphabets);
            result = result > sum ? result : sum;
            start++;
	    end++;
        }
        return result;
    }

    public int findMaxVowels(int[] alphabets) {
        return alphabets['a' - 'a'] + alphabets['e' - 'a'] + alphabets['i' - 'a'] + alphabets['o' - 'a'] + alphabets['u' - 'a'];
    }
}