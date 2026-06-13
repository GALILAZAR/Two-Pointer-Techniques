class Solution {
    public int numJewelsInStones(String jewels, String stones) {

        Set<Character> result = new HashSet<>();

        for(int i = 0; i<jewels.length(); i++)
        {
            
            result.add (jewels.charAt(i));
        }
        int count = 0;
        for(int i = 0; i<stones.length(); i++)
        {
            if(result.contains(stones.charAt(i)))
            count++;
        }
        return count;
        
    }
}