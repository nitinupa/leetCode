class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int l = 0;
        int r = n-1;
        int temp_area=0;
        int max_area=0;
        for(int i=0;i<n;i++) {
            temp_area = Math.min(height[l],height[r])*(r-l);
            if(height[l]<height[r]) {
                l++;
            }else {
                r--;
            }
            max_area = Math.max(max_area,temp_area);
        }
        return max_area;
    
    }
}
