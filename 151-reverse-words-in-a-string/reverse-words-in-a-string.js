/**
 * @param {string} s
 * @return {string}
 */
var reverseWords = function(s) {

    let str = s.trim().split(/\s+/)
    let arr = []
    let index = 0;
     
     for(let i = str.length-1; i>=0; i--)
     {
        arr[index] = str[i];
        index++;
     }
     return arr.join(" ")
    
};