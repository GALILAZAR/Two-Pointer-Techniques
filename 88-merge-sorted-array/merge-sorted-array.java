class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int[] result = new int[m + n];

        int i = 0;  // pointer for nums1
        int j = 0;  // pointer for nums2
        int k = 0;  // pointer for result

        // Merge both arrays
        while (i < m && j < n) {
            if (nums1[i] <= nums2[j]) {
                result[k] = nums1[i];
                i++;
            } else {
                result[k] = nums2[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of nums1
        while (i < m) {
            result[k] = nums1[i];
            i++;
            k++;
        }

        // Copy remaining elements of nums2
        while (j < n) {
            result[k] = nums2[j];
            j++;
            k++;
        }

        // Copy result back to nums1
        for (int x = 0; x < m + n; x++) {
            nums1[x] = result[x];
        }
    }
}