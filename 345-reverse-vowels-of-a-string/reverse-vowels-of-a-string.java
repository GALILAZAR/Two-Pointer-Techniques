class Solution {
    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            while(left < right) {
                char ch1 = Character.toLowerCase(arr[left]);
                if (ch1 == 'a' || ch1 == 'e' || ch1 == 'i' || ch1 == 'o' || ch1 == 'u') {
                    break;
                } else {
                    left++;
                }
            }
            while(right > left) {
                char ch2 = Character.toLowerCase(arr[right]);
                if (ch2 == 'a' || ch2 == 'e' || ch2 == 'i' || ch2 == 'o' || ch2 == 'u') {
                    break;
                } else {
                    right--;
                }
            }
            char temp = arr[left];
            arr[left++] = arr[right];
            arr[right--] = temp;
        }
        return new String(arr);
    }
}