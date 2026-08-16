/**
 * @param {string} s
 * @return {boolean}
 */
var areOccurrencesEqual = function(s) {
    
    let freq = new Array(26).fill(0);

    for(let i = 0; i<s.length; i++)
    {
        freq[s.charCodeAt(i)-97]++;

    }
    let count = 0;
    for(let i = 0; i<s.length; i++)
    {
        if(freq[i] > 0)
        {
            count = freq[i];
            break;
        }
    }
    for(let i = 0; i<s.length; i++)
    {
        if(freq[i] > 0 && freq[i] != count)
        {
            return false;
        }
    }
    return true;
};