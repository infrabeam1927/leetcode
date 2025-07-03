class Solution {
    public int trailingZeroes(int n) {
        int prod=1;
        int count=0;
        if(n==1){
            return 0;
        }
        while (n >= 5) {
            n /= 5;
            count += n;
        }
        return count;
       

    }
}