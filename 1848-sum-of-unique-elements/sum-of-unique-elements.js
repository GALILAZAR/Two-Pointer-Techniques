/**
 * @param {number[]} nums
 * @return {number}
 */
var sumOfUnique = function(nums) {

    let freq = new Array(101).fill(0);

    for(let i = 0; i<nums.length;i++)
    {
        freq[nums[i]]++;
    }
    let sum = 0;
    for(let i = 0; i<freq.length; i++)
    {
        if(freq[i] == 1)
        {
            sum = sum+i;
        }
    }
    return sum;
};