/**
 * @param {number[]} nums
 * @return {boolean}
 */
var containsDuplicate = function(nums) {

    nums.sort((a,b)=> a-b);
    let count = 1;
    for(let i = 0; i<nums.length-1; i++)
    {
        if(nums[i] == nums[i+1])
        {
            count++;
        }
    }
    
    if(count >= 2)
    {
        return true;
    }
    return false;

};