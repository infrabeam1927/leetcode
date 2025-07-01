class Solution {
    public boolean isPalindrome(int x) {
        if(x==0){
            return true;
        }
        else if(x<=0){
            return false;
        }
        int reverseInteger=0;
        int y=x;
        while (x!=0){
            reverseInteger=reverseInteger*10+(x%10);
            x=x/10;
        }
        if (reverseInteger==y){
            return true;
        }
        return false;
        
    }
}