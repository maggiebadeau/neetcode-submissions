class Solution {
    public String encode(List<String> strs) {
        String result = "";

        for (String str : strs) {
            result += str.length() + "#" + str;
        }

        return result;
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();

        int i = 0;

        while (i < str.length()) {
            int j = i;
            
            while (str.charAt(j) != '#') {
                j++;
            }

            int strLength = Integer.parseInt(str.substring(i, j));

            String word = str.substring(j + 1, j + 1 + strLength);
            result.add(word);

            i = j + 1 + strLength;
        }

        return result;
    }
}
