class Solution {
    public int lengthOfLongestSubstring(String s) {

       Stack<Character> stack = new Stack<>();

        int max = 0;

        for(int i = 0; i<s.length(); i++)
        {
            char ch = s.charAt(i);

           while(stack.contains(ch))
           {
             stack.remove(0);
           }
           stack.push(ch);
           max = Math.max(max,stack.size());
        }
        return max;

    }

}