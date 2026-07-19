/**
 * @param {number} n
 * @return {number}
 */
var pivotInteger = function(n) {

    let right_side = ((n*n)+n) / 2;
    let x =Math.floor( Math.sqrt(right_side));

    if(x*x === right_side)
    {
        return x;
    }
    return -1;
};