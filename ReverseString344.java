class Solution {
    public void reverseString(char[] s) {
        int n = s.length;
        char  temp;
        if (n%2==0){
            for(int i =0; i<n/2;i++){
                temp=s[i];
                s[i]=s[n-i-1];
                s[n-i-1]=temp ;               
            }
        }
        else{
            for(int i =0; i<n/2;i++){
                temp=s[i];
                s[i]=s[n-i-1];
                s[n-i-1]=temp ;               
            }
        }
    }
}