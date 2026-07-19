class Solution {
    public int minimumSum(int num) {

        int arr[] = new int[4];
        int index = 0;

        while(num > 0)
        {
            int digit = num % 10;
            arr[index] = digit;
            index++;
            num = num / 10;

        }
        Arrays.sort(arr);

        int first_num = arr[0] *10 + arr[2];
        int second_num = arr[1] * 10 + arr[3];
        int sum = first_num + second_num;
        return sum;

    }
}