class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        

        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i<nums1.length; i++)
        {
            list.add(nums1[i]);
        }

        ArrayList<Integer> list2 = new ArrayList<>();

        for(int i = 0; i<nums2.length; i++)

        {
            if(list.contains(nums2[i]))
            {
                list2.add(nums2[i]);
                list.remove(Integer.valueOf(nums2[i]));
            }
        }

        int arr [] = new int [list2.size()];
        int index = 0;

        for(int num : list2)
        {
            arr[index] = num;
            index++;
        }
        return arr;
    }
}