class Solution {
    public boolean isIsomorphic(String s, String t) {
        

        if(s.length() != t.length())
        {
            return false;
        }

        Map<Character,Character> map1 = new HashMap<>();
         Map<Character,Character> map2 = new HashMap<>();


         for(int i = 0; i<s.length(); i++)
         {
            map1.put(s.charAt(i),t.charAt(i));
            map2.put(t.charAt(i),s.charAt(i));
         }

         // map1

         for(int i = 0; i<s.length(); i++)
         {
            char ch1 = s.charAt(i);
            if(map1.get(ch1) != t.charAt(i))
            {
                return false;
            }
         }

         // map2
          for(int i = 0; i<t.length(); i++)
         {
            char ch2 = t.charAt(i);
            if(map2.get(ch2) != s.charAt(i))
            {
                return false;
            }
         }
         return true;
    }
}