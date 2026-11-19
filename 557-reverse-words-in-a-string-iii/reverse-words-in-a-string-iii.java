class Solution {
    public String reverseWords(String s) {

        String [] arr = s.split(" ");
       String final1 = "";
        for(int i = 0; i<arr.length; i++)
        {
            char [] result = arr[i].toCharArray();
            for(int j = result.length-1; j>=0; j--)
            {
                final1 = final1 + result[j];
            }
            if(i < arr.length-1)

            {
                final1 = final1 + " ";
            }
             
        }
        return final1;
        
        
    }
}