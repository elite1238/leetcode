class Solution {
    public boolean isSubsequence(String s, String t) {
        int j=0,n1=s.length(),n2=t.length();
        for(int i=0;i<n2;i++){
            if(j>=n1) return true;
            if(s.charAt(j)==t.charAt(i))
            
                ++j;
        }
        if(n1<=j) return true;
        return false;
    }
}