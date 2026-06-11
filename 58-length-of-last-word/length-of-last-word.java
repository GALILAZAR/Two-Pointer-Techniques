class Solution {
    public int lengthOfLastWord(String s) {

        String [] arr = s.trim().split("\\s+");

        for(int i = arr.length-1; i>=0; i--)
        {
            break;
        }

        return arr[arr.length-1].length();
    }
}