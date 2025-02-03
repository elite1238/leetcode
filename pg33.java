class Solution {
    public int search(int[] nums, int target) {
        if(nums.length==1) return nums[0]==target?0:-1;
        int k=0,j=nums.length-1;
        for(int i=0;i<j;++i){
            if(nums[i]==target) return i;
            if(nums[i]>nums[i+1]){
                k=i;break;
            }
        }
        ++k;
        int i=0;
        while(i<=j){
            int a=nums[(k+(i+j)/2)%nums.length];
            if(a>target) j=(i+j)/2-1;
            else if(a<target)i=(i+j)/2+1;
            else return (k+(i+j)/2)%nums.length;
        }
        return -1;
    }
}