class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                left[i] = 1;
            } else if (i == 1) {
                left[i] = nums[0];
            } else {
                left[i] = left[i-1] * nums[i-1];
            }
        }

        for (int i = nums.length - 1; i >= 0; i--) {
            if (i == nums.length - 1) {
                right[nums.length - 1] = 1;
            } else if (i == nums.length - 2) {
                right[nums.length - 2] = nums[i + 1];
            } else {
                right[i] = right[i+1] * nums[i+1];
            }
        }

        for (int i = 0; i < result.length; i++) {
            result[i] = left[i] * right[i];
        }

        return result;
    }
}  
