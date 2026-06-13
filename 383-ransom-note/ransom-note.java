class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {

        Map<Character, Integer> result = new HashMap<>();
        

        for(int i = 0; i<ransomNote.length(); i++)
        {
            char ch = ransomNote.charAt(i);

            result.put(ch, result.getOrDefault(ch,0) + 1);
        }
         Map<Character, Integer> result2 = new HashMap<>();
         for(int i = 0; i<magazine.length(); i++)
        {
            char ch = magazine.charAt(i);

            result2.put(ch, result2.getOrDefault(ch,0) + 1);
        }
        for(int i = 0; i<ransomNote.length(); i++)
        {
            char ch = ransomNote.charAt(i);

            if(!result2.containsKey(ch) || result.get(ch) > result2.get(ch))
            {
                return false;
            }
        }
        return true;
    }
}