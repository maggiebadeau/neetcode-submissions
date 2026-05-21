class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) { return false; }

        HashMap<Character, Integer> sCharacters = new HashMap<>();
        HashMap<Character, Integer> tCharacters = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            sCharacters.put(s.charAt(i), sCharacters.getOrDefault(s.charAt(i), 0) + 1);
            tCharacters.put(t.charAt(i), tCharacters.getOrDefault(t.charAt(i), 0) + 1);
        }

        return sCharacters.equals(tCharacters);
    }
}
