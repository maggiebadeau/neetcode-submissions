class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> stringMap = new HashMap<>();
        List<List<String>> groupedAnagrams = new ArrayList<>();

        for (int i = 0; i < strs.length; i++) {
            String str = strs[i];
            int[] freq = new int[26];

            for (int j = 0; j < str.length(); j++) {
                freq[str.charAt(j) - 'a']++;
            }

            StringBuilder keyBuilder = new StringBuilder();

            for (int k = 0; k < 26; k++) {
                keyBuilder.append('#');
                keyBuilder.append(freq[k]);
            }

            String key = keyBuilder.toString();

            stringMap.putIfAbsent(key, new ArrayList<>());
            stringMap.get(key).add(str);
        }

        for (List<String> group : stringMap.values()) {
            groupedAnagrams.add(group);
        }

        return groupedAnagrams;
    }
}