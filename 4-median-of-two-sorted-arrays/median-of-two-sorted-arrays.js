/**
 * @param {number[]} nums1
 * @param {number[]} nums2
 * @return {number}
 */
var findMedianSortedArrays = function(nums1, nums2) {

   let result =  nums1.concat(nums2);
    result.sort((a,b) => a-b);
    let n = result.length;
    if(n % 2 != 0)

    {
       return result[Math.floor(n / 2)]
    }
    else
    {
         return (result[n / 2 - 1] + result[n / 2]) / 2;
    }
};