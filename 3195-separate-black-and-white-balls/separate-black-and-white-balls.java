class Solution {
    public long minimumSteps(String s) {
        char[] arr = s.toCharArray();

        long steps = 0;
        int zeroPos = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '0') {
                steps += i - zeroPos;
                zeroPos++;
            }
        }

        return steps;
    }
}