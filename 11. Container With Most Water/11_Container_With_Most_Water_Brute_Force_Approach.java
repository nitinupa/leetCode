class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int l = 0;
        int r = n-1;
        int temp_area=0;
        int max_area=0;
        for(int i=0;i<n;i++) {
            if(height[l]<=height[r]) {
                temp_area = height[l]*(r-l);
            } else {
                temp_area = height[r]*(r-l);
            }
            r--;
            if(l>=r) {
                l++;
                r = n-1;
                i = l;
            }
            max_area = Math.max(max_area, temp_area);
        }
        return max_area;
    }
}
