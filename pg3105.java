class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        if(nums.length<=1)return nums.length;
        int count=0;
        int x=1,y=1;
        for(int i=0;i<nums.length-1;++i){
            if(nums[i]<nums[i+1]){
                ++x;
                y=1;
            }
            else if(nums[i]>nums[i+1]){
                ++y;
                x=1;
            }
            else{
                x=1;
                y=1;
            }
            count=Math.max(Math.max(x,y),count);
        }
        return count;
    }
}