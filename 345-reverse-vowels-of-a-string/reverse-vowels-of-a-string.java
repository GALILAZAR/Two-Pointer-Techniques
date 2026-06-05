class Solution {
    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        int left = 0;
        int right = arr.length - 1;
        boolean flag1 = false, flag2 = false;
        while (left < right) {
            char ch1 = Character.toLowerCase(arr[left]);
            char ch2 = Character.toLowerCase(arr[right]);
            if(!flag1) {
                if (ch1 == 'a' || ch1 == 'e' || ch1 == 'i' || ch1 == 'o' || ch1 == 'u') {
                    flag1 = true;
                } else {
                    left++;
                }
            }
            if (!flag2) {
                if (ch2 == 'a' || ch2 == 'e' || ch2 == 'i' || ch2 == 'o' || ch2 == 'u') {
                    flag2 = true;
                } else {
                    right--;
                }
            }
            if (flag1 && flag2) {
                char temp = arr[left];
                arr[left++] = arr[right];
                arr[right--] = temp;
                flag1 = false;
                flag2 = false;
            }
        }
        return new String(arr);
    }
}