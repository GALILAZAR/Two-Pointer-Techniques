class Solution {
    public boolean checkIfPangram(String sentence) {
        
        int count = 0;
        for(int i = 0; i < sentence.length(); i++)
        {
            if(sentence.indexOf(sentence.charAt(i)) == i)
            {
                count++;
            }
            else
            {
                continue;
            }
        }
        if(count == 26)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}