class Solution {
    public int maxArea(int[] heights) {
        int largestArea = 0;
        int i = 0;
        int j = heights.length - 1;
        int currentArea;

        while (i != j && i < heights.length - 1 && j > 0) {
            currentArea = calculateArea(heights[i], heights[j], i, j);

            if (currentArea > largestArea) {
                largestArea = currentArea;
            }

            if (heights[i] < heights[j]) {
                i++;
            } else {
                j--;
            }
        }

        return largestArea;
    }

    protected int calculateArea(int a, int b, int i, int j) {
        int width = j - i;
        int height = Math.min(a, b);
        return width * height;
    }
}
