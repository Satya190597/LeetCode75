class Solution {
    public String removeStars(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++)
        {
            if(s.charAt(i)=='*')
                stack.pop();
            else 
                stack.push(s.charAt(i));
        }
        char[] result = new char[stack.size()];
        int index = stack.size()-1;
        while(!stack.isEmpty())
        {
           result[index] = stack.pop();
           index--;
        }
        return String.valueOf(result);
    }
}