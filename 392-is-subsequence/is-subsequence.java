class Solution {
    public boolean isSubsequence(String s, String t) {
        // First initialize two pointers
        int i = 0;
        int j = 0;

        while(i < s.length() && j < t.length())
        {
            if(s.charAt(i) == t.charAt(j))
            {
                i++;
                j++;
            }
            else{
                j++; // increment only second string
            }
        }
        return (i == s.length()); //we reached end of the first string return true
    }
}