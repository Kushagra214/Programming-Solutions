//LeetCode solution
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int i=m-1,j=n-1,k=m+n-1;
        
        while(i>=0&&j>=0){
            if(nums2[j]>nums1[i]){
                nums1[k] = nums2[j];
                j--;
            }else{
                nums1[k] = nums1[i];
                nums1[i] = Integer.MIN_VALUE;
                i--;
            }
            k--;
        }
        if(j>=0){
            for(i=0;i<=j;i++)
                nums1[i]=nums2[i];
        }
    }
}