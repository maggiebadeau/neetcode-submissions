class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i = 0;
        int j = numbers.length - 1;

        while (numbers[i] + numbers[j] != target) {
            int sum = numbers[i] + numbers[j];

            if (sum > target) {
                j--;
            } else {
                i++;
            }
        }

        return new int[]{i + 1, j + 1};
    }
}
