/**
 * @param {number} num
 * @return {number}
 */
var minimumSum = function(num) {

    let arr = new Array(4);
    let index = 0;

    while(num > 0)
    {
        let digit = num % 10;
        arr[index] = digit;
        index++;
        num = Math.floor(num / 10);
    }
    arr.sort((a,b)=>a-b);

    let first_num = arr[0]*10 + arr[2];
    let second_num = arr[1] * 10+arr[3];
    let sum = first_num+second_num;
    return Number(sum);
    
};