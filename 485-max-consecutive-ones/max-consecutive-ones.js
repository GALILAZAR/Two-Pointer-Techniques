/**
 * @param {number[]} nums
 * @return {number}
 */
var findMaxConsecutiveOnes = function(nums) {
    let previous_count = 0;
    let current_count = 0;

    for(let i = 0; i<nums.length; i++)

    {
        if(nums[i] == 1)
        {
            previous_count++;
        }
        else
        {
               current_count = Math.max(previous_count,current_count);
               previous_count = 0;
        }
    
        
    }
    current_count = Math.max(previous_count,current_count);

    return current_count;
    
};