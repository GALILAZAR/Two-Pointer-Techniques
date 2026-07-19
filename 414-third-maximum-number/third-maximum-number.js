/**
 * @param {number[]} nums
 * @return {number}
 */
var thirdMax = function(nums) {
    let unique = [...new Set(nums)];

    let first_max = Math.max(...unique);

    if (unique.length < 3) {
        return first_max;
    }

    let second_max = Math.max(...unique.filter(num => num !== first_max));

    let third_max = Math.max(
        ...unique.filter(num => num !== first_max && num !== second_max)
    );

    return third_max;
};