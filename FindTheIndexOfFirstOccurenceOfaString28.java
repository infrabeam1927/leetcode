class Solution {
    public int strStr(String haystack, String needle) {
        char[] a= haystack.toCharArray();
        String l="";
        int s=-1;
        int len=needle.length();
        for(int i=0;i<haystack.length()-len;i++){
            l="";
            for(int j=i;j<i+len;j++){
                l=l+a[j];
            }
            System.out.println(needle + l);
            if (l.equals(needle)){
                return i;
            }
        }
        return s;
    }
}