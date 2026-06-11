class Solution {
    public boolean isPalindrome(String s) {
        String clean = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        for (int i = 0; i < clean.length(); i++) {
            int j = clean.length() - i - 1;

            if (i != j && clean.charAt(i) != clean.charAt(j)) {
                return false;
            } else if (i == j && clean.length()%2 == 1) {
                return true;
            }
        }

        return true;
    }
}
