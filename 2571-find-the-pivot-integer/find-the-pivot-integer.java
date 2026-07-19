class Solution {
    public int pivotInteger(int n) {
        int right_side = ((n*n)+n) / 2;

        int x = (int) Math.sqrt(right_side);
        if(x*x == right_side)
        {
            return x;
        }
        return -1;
        
    }
}