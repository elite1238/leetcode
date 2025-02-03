class Solution {
    public String removeStars(String s) {
        StringBuilder sb = new StringBuilder();
        int size=-1,n=s.length();
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='*'){
                if(size>=0) sb.deleteCharAt(size--);
            }
            else{
                sb.append(s.charAt(i)+"");
                size++;
            }
        }
        return sb.toString();
    }
}