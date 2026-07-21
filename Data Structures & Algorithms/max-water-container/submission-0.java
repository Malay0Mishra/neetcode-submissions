class Solution {
    public int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length - 1;
        int  maxValue = 0;
        int result = 0;
            while (left < right){
                int width = right - left;
                int height = Math.min(heights[left], heights[right]);
                int area = width*height;
                result = Math.max(result , area);
                if(heights[left] < heights[right]){
                    left++;
                }
                else{
                    right--;
                }
            }
            return result;
        }
    }

