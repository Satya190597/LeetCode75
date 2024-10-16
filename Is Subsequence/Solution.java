class Solution {
    public boolean isSubsequence(String s, String t) {
        int pointerOne = 0;
        int pointerTwo = 0;
        while(pointerOne<s.length() && pointerTwo<t.length())
        {
            if(s.charAt(pointerOne)==t.charAt(pointerTwo)) 
            {
                pointerOne++;
                pointerTwo++;
            }        
            else
            {
                pointerTwo++;
            }
        }
        return pointerOne == s.length();
    }
}