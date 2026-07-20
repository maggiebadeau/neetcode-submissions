class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> unique = new HashSet<>();
        int longestSequence = 0;

        for (int num : nums) {
            unique.add(num);
        }

        for (int num : nums) {
            int currentSequence = 0;
            int currentNum = num;

            while (unique.contains(currentNum)) {
                currentSequence++;
                currentNum++;
            }

            longestSequence = Math.max(longestSequence, currentSequence);
        }

        return longestSequence;
    }
}
