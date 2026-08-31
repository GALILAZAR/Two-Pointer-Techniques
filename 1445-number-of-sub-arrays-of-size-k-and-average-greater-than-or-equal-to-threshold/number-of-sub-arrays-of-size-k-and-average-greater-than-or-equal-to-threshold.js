/**
 * @param {number[]} arr
 * @param {number} k
 * @param {number} threshold
 * @return {number}
 */
var numOfSubarrays = function(arr, k, threshold) {

    let nums = [arr.length-k+1];
    let windowAvg = 0;

    for(let i = 0; i<k; i++)
    {
        windowAvg = windowAvg + arr[i]
    }
    nums[0] = (windowAvg) / k;
    let index = 1;

    for(let i = k; i<arr.length; i++)
    {
        windowAvg = windowAvg + arr[i]-arr[i-k];
        nums[index] = (windowAvg) / k;
        index++;
    }
    let count = 0;
    for(let i = 0; i<nums.length; i++)
    {
        if(nums[i] >= threshold)
        {
            count++;
        }
    }
    return count;
    
};